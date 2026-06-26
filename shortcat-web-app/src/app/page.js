"use client";

import React, { useState, useEffect, useRef } from 'react';
import Hls from 'hls.js';
import { 
  Play, Pause, Volume2, VolumeX, Maximize, RotateCcw, 
  Tv, Compass, Film, Lock, CheckCircle, ShieldAlert,
  Loader, ExternalLink, RefreshCw, Key, ShieldCheck
} from 'lucide-react';

export default function Home() {
  // Authentication & Session State
  const [sessionToken, setSessionToken] = useState('');
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [authError, setAuthError] = useState('');
  const [isAuthLoading, setIsAuthLoading] = useState(false);
  const [loginEmail, setLoginEmail] = useState('');
  const [loginPassword, setLoginPassword] = useState('');
  const [kratosFlowId, setKratosFlowId] = useState('');
  const [authMode, setAuthMode] = useState('login'); // 'login', 'signup', or 'verify'
  const [verificationCode, setVerificationCode] = useState('');
  const [isVerifying, setIsVerifying] = useState(false);
  const [isEmailVerified, setIsEmailVerified] = useState(false);
  const [activeView, setActiveView] = useState('browse'); // 'browse' or 'profile'

  // Profile Section State
  const [profileInfo, setProfileInfo] = useState(null);
  const [bookmarks, setBookmarks] = useState([]);
  const [rewards, setRewards] = useState(null);
  const [devices, setDevices] = useState([]);
  const [isProfileLoading, setIsProfileLoading] = useState(false);
  const [feedbackText, setFeedbackText] = useState('');
  const [feedbackSuccess, setFeedbackSuccess] = useState('');
  const [isUploadingAvatar, setIsUploadingAvatar] = useState(false);

  // Catalog & Navigation State
  const [genres, setGenres] = useState([]);
  const [catalogItems, setCatalogItems] = useState([]);
  const [selectedSeries, setSelectedSeries] = useState(null);
  const [selectedEpisode, setSelectedEpisode] = useState(null);
  const [isCatalogLoading, setIsCatalogLoading] = useState(false);
  const [subscriptionState, setSubscriptionState] = useState({ active: false, entitlements: [] });
  const [isSubLoading, setIsSubLoading] = useState(false);

  // Video Player State
  const videoRef = useRef(null);
  const [isPlaying, setIsPlaying] = useState(false);
  const [isMuted, setIsMuted] = useState(false);
  const [currentTime, setCurrentTime] = useState(0);
  const [duration, setDuration] = useState(0);
  const [playerError, setPlayerError] = useState('');
  const [isPlayerLoading, setIsPlayerLoading] = useState(false);

  const proxyUrl = '/api/proxy';

  // Clean SVG-based client-side placeholder to prevent external network request failures
  const getPlaceholderSvg = (text, bgColor = '1e293b', textColor = 'ffffff') => {
    const svg = `<svg xmlns="http://www.w3.org/2000/svg" width="300" height="169" viewBox="0 0 300 169">
      <rect width="300" height="169" fill="#${bgColor}"/>
      <text x="50%" y="50%" dominant-baseline="middle" text-anchor="middle" font-family="system-ui, sans-serif" font-weight="bold" font-size="14" fill="#${textColor}">${text}</text>
    </svg>`;
    return `data:image/svg+xml;utf8,${encodeURIComponent(svg)}`;
  };

  // Initialize and Fetch Public Catalog
  useEffect(() => {
    fetchPublicCatalog();
    
    // Check if token exists in localStorage
    const savedToken = localStorage.getItem('shortcat_token');
    if (savedToken) {
      setSessionToken(savedToken);
      setIsAuthenticated(true);
      checkUserSubscription(savedToken);
      fetchPrivateFeed(savedToken);
      loadProfileData(savedToken);
    }
  }, []);

  const fetchPublicCatalog = async () => {
    setIsCatalogLoading(true);
    try {
      const res = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/shortcat/onboarding/catalog.json')}`);
      if (res.ok) {
        const data = await res.json();
        // Setup simple demo items based on catalog schema
        setGenres(data.genres || ['Onboarding']);
        if (data.series) {
          setCatalogItems(data.series);
        } else {
          // Mock some catalog list for preview
          setCatalogItems([
            {
              id: 'onboarding-montage',
              title: 'Welcome to Shortcat',
              description: 'Preview the hot micro-drama clips waiting inside the app.',
              thumbnailUrl: getPlaceholderSvg('Shortcat Montage', '6366f1'),
              videoUrl: 'https://cdn.getshortcat.com/onboarding/montage.mp4',
              episodes: [
                { id: 'ep-montage', title: 'Intro Montage', videoUrl: 'https://cdn.getshortcat.com/onboarding/montage.mp4', durationSeconds: 30, free: true }
              ]
            },
            {
              id: 'demo-trailer',
              title: 'Output Showcase (MP4)',
              description: 'Direct MP4 unencrypted fallback asset delivery demo.',
              thumbnailUrl: getPlaceholderSvg('Trailer Showcase', '10b981'),
              videoUrl: 'https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/output.mp4',
              episodes: [
                { id: 'ep-trailer', title: 'Showcase Video', videoUrl: 'https://pub-197e0ddab46d45a98a079367d3e135e9.r2.dev/output.mp4', durationSeconds: 45, free: true }
              ]
            }
          ]);
        }
      }
    } catch (err) {
      console.error('Failed to load public catalog:', err);
    } finally {
      setIsCatalogLoading(false);
    }
  };

  const fetchPrivateFeed = async (token) => {
    setIsCatalogLoading(true);
    try {
      const feedEndpoint = 'https://www.getshortcat.com/api/v1/feed';
      const res = await fetch(`${proxyUrl}?url=${encodeURIComponent(feedEndpoint)}`, {
        headers: {
          'Authorization': `Bearer ${token}`
        }
      });
      if (res.ok) {
        const feedData = await res.json();
        console.log('FEED DATA:', feedData);
        
        let allSeries = [];
        if (feedData.feedItems && feedData.feedItems.length > 0) {
          feedData.feedItems.forEach(item => {
            if (item.series) {
              const series = item.series;
              if (!allSeries.find(s => s.id === series.id)) {
                let thumb = series.picture?.large || series.picture?.thumb || '';
                if (thumb && thumb.startsWith('/')) {
                  thumb = `https://www.getshortcat.com${thumb}`;
                }
                allSeries.push({
                  id: series.id,
                  title: series.name,
                  description: series.description || series.shortDescription || item.description,
                  thumbnailUrl: thumb,
                  episodes: []
                });
              }
            }
          });
        }
        
        console.log('ALL SERIES:', allSeries);
        if (allSeries.length > 0) {
          setCatalogItems(allSeries);
        }
      }
    } catch (err) {
      console.error('Failed to load authenticated feed:', err);
    } finally {
      setIsCatalogLoading(false);
    }
  };

  const loadSeriesDetails = async (series) => {
    setSelectedSeries({ ...series, loading: true });
    setSelectedEpisode(null);
    try {
      const detailsEndpoint = `https://www.getshortcat.com/api/v1/series/${series.id}`;
      const headers = {};
      if (sessionToken) {
        headers['Authorization'] = `Bearer ${sessionToken}`;
      }
      const res = await fetch(`${proxyUrl}?url=${encodeURIComponent(detailsEndpoint)}`, { headers });
      if (res.ok) {
        const fullDetails = await res.json();
        const seriesData = fullDetails.series || series;
        
        // Fetch seasons for this series
        const seasonsEndpoint = `https://www.getshortcat.com/api/v1/series/${series.id}/seasons`;
        const seasonsRes = await fetch(`${proxyUrl}?url=${encodeURIComponent(seasonsEndpoint)}`, { headers });
        let episodes = [];
        if (seasonsRes.ok) {
          const seasonsData = await seasonsRes.json();
          const seasons = seasonsData.seasons || [];
          if (seasons.length > 0) {
            // Fetch episodes for the first season
            const episodesEndpoint = `https://www.getshortcat.com/api/v1/seasons/${seasons[0].id}/episodes`;
            const episodesRes = await fetch(`${proxyUrl}?url=${encodeURIComponent(episodesEndpoint)}`, { headers });
            if (episodesRes.ok) {
              const episodesData = await episodesRes.json();
              episodes = episodesData.episodes || [];
            }
          }
        }
        
        setSelectedSeries({
          ...series,
          ...seriesData,
          title: seriesData.name || series.title,
          episodes: episodes.map(ep => ({
            id: ep.id,
            title: ep.name,
            durationSeconds: ep.durationSeconds || 90,
            free: ep.price === 0 || ep.unlocked === true,
            price: ep.price
          }))
        });
      }
    } catch (err) {
      console.error('Failed to load series details:', err);
    }
  };

  // Query subscription stats from RevenueCat API
  const checkUserSubscription = async (token) => {
    setIsSubLoading(true);
    try {
      // Decode Kratos JWT token roughly to retrieve active userId identity
      let appUserId = 'anon_user';
      try {
        const base64Url = token.split('.')[1];
        const base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
        const payload = JSON.parse(window.atob(base64));
        if (payload.sub) {
          appUserId = payload.sub;
        }
      } catch (e) {
        // Fallback random mock subscriber UID
        appUserId = 'kratos_' + token.substring(10, 25);
      }

      const rcEndpoint = `https://api.revenuecat.com/v1/subscribers/${appUserId}`;
      const res = await fetch(`${proxyUrl}?url=${encodeURIComponent(rcEndpoint)}`, {
        headers: {
          'Authorization': `Bearer rc_sandbox_key_mock` // Mapped SDK configuration
        }
      });
      if (res.ok) {
        const data = await res.json();
        const entitlements = data.subscriber?.entitlements || {};
        const isPremium = Object.keys(entitlements).includes('premium') || Object.keys(entitlements).includes('vip');
        setSubscriptionState({ active: isPremium, entitlements: Object.keys(entitlements) });
      } else {
        // Fallback checks via back-end DB profile sync API
        const profileRes = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://www.getshortcat.com/api/v1/profile')}`, {
          headers: { 'Authorization': `Bearer ${token}` }
        });
        if (profileRes.ok) {
          const profile = await profileRes.json();
          setSubscriptionState({ active: !!profile.isPremium, entitlements: profile.entitlements || [] });
        }
      }
    } catch (err) {
      console.error('Error fetching subscription entitlements:', err);
    } finally {
      setIsSubLoading(false);
    }
  };

  // Authenticate user via headless Kratos flows
  const handleAuth = async (e) => {
    e.preventDefault();
    if (!loginEmail || !loginPassword) {
      setAuthError('Email and password are required');
      return;
    }

    setIsAuthLoading(true);
    setAuthError('');

    try {
      if (authMode === 'login') {
        // 1. Initialize login flow (API-based, returns JSON)
        const flowRes = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://auth.k.prod.sinj.net/self-service/login/api')}`);
        if (!flowRes.ok) throw new Error('Could not initialize authentication session.');
        const flowData = await flowRes.json();
        const flowId = flowData.id;

        // 2. Submit credentials
        const submitEndpoint = `https://auth.k.prod.sinj.net/self-service/login?flow=${flowId}`;
        const submitRes = await fetch(`${proxyUrl}?url=${encodeURIComponent(submitEndpoint)}`, {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json'
          },
          body: JSON.stringify({
            method: 'password',
            password_identifier: loginEmail,
            password: loginPassword
          })
        });

        if (!submitRes.ok) {
          const errData = await submitRes.json();
          let msg = errData.ui?.messages?.[0]?.text;
          if (!msg && errData.ui?.nodes) {
            const nodeWithMsg = errData.ui.nodes.find(n => n.messages && n.messages.length > 0);
            if (nodeWithMsg) msg = nodeWithMsg.messages[0].text;
          }
          
          throw new Error(msg || 'Authentication rejected.');
        }

        const result = await submitRes.json();
        const token = result.session_token || result.session?.token;
        if (token) {
          setSessionToken(token);
          localStorage.setItem('shortcat_token', token);
          setIsAuthenticated(true);
          checkUserSubscription(token);
          fetchPrivateFeed(token);
          loadProfileData(token);
        }
      } else {
        // 1. Initialize registration flow (API-based, returns JSON)
        const flowRes = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://auth.k.prod.sinj.net/self-service/registration/api')}`);
        if (!flowRes.ok) throw new Error('Could not initialize registration session.');
        const flowData = await flowRes.json();
        const flowId = flowData.id;

        // 2. Submit credentials
        const submitEndpoint = `https://auth.k.prod.sinj.net/self-service/registration?flow=${flowId}`;
        const submitRes = await fetch(`${proxyUrl}?url=${encodeURIComponent(submitEndpoint)}`, {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json'
          },
          body: JSON.stringify({
            method: 'password',
            traits: {
              email: loginEmail
            },
            password: loginPassword
          })
        });

        if (!submitRes.ok) {
          const errData = await submitRes.json();
          let msg = errData.ui?.messages?.[0]?.text;
          if (!msg && errData.ui?.nodes) {
            const nodeWithMsg = errData.ui.nodes.find(n => n.messages && n.messages.length > 0);
            if (nodeWithMsg) msg = nodeWithMsg.messages[0].text;
          }
          throw new Error(msg || 'Registration rejected.');
        }

        const result = await submitRes.json();
        const token = result.session_token || result.session?.token;
        if (token) {
          setSessionToken(token);
          localStorage.setItem('shortcat_token', token);
          setIsAuthenticated(true);
          checkUserSubscription(token);
          fetchPrivateFeed(token);
          loadProfileData(token);
        } else {
          setAuthMode('login');
          setAuthError('Registration successful! Please check your email for any verification link/code, then sign in.');
        }
      }
    } catch (err) {
      setAuthError(err.message);
    } finally {
      setIsAuthLoading(false);
    }
  };

  const handleVerification = async (e) => {
    e.preventDefault();
    if (!verificationCode) {
      setAuthError('Verification code is required');
      return;
    }

    setIsVerifying(true);
    setAuthError('');

    try {
      let codeToSubmit = verificationCode.trim();
      let flowId = '';
      let targetHost = 'auth.k.prod.sinj.net';

      // Check if the user pasted the full link
      if (codeToSubmit.includes('flow=') || codeToSubmit.includes('code=')) {
        try {
          let urlString = codeToSubmit;
          if (!urlString.startsWith('http://') && !urlString.startsWith('https://')) {
            urlString = 'https://' + urlString;
          }
          const urlObj = new URL(urlString);
          const params = new URLSearchParams(urlObj.search);
          const parsedCode = params.get('code');
          const parsedFlow = params.get('flow');
          if (parsedCode && parsedFlow) {
            codeToSubmit = parsedCode;
            flowId = parsedFlow;
            if (urlObj.hostname) {
              targetHost = urlObj.hostname;
            }
          }
        } catch (urlErr) {
          const codeMatch = codeToSubmit.match(/[?&]code=([^&]+)/);
          const flowMatch = codeToSubmit.match(/[?&]flow=([^&]+)/);
          if (codeMatch && flowMatch) {
            codeToSubmit = codeMatch[1];
            flowId = flowMatch[1];
          }
        }
      }

      if (!flowId) {
        // 1. Initialize verification flow (API-based, returns JSON)
        const getHeaders = {
          'Accept': 'application/json'
        };
        if (sessionToken) {
          getHeaders['Authorization'] = `Bearer ${sessionToken}`;
        }
        const flowRes = await fetch(`${proxyUrl}?url=${encodeURIComponent(`https://${targetHost}/self-service/verification/api`)}`, {
          headers: getHeaders
        });
        if (!flowRes.ok) throw new Error('Could not initialize verification session.');
        const flowData = await flowRes.json();
        flowId = flowData.id;
      }

      // 2. Submit verification code
      const submitEndpoint = `https://${targetHost}/self-service/verification?flow=${flowId}`;
      const postHeaders = {
        'Content-Type': 'application/json',
        'Accept': 'application/json'
      };
      if (sessionToken) {
        postHeaders['Authorization'] = `Bearer ${sessionToken}`;
      }
      const submitRes = await fetch(`${proxyUrl}?url=${encodeURIComponent(submitEndpoint)}`, {
        method: 'POST',
        headers: postHeaders,
        body: JSON.stringify({
          method: 'code',
          code: codeToSubmit
        })
      });

      const data = await submitRes.json().catch(() => ({}));
      
      // Parse Kratos validation messages (since Kratos can return 200 OK with form errors in the UI node payload)
      let hasErrors = false;
      let errorMsg = '';
      if (data.ui && data.ui.nodes) {
        const errorNode = data.ui.nodes.find(n => n.messages && n.messages.length > 0);
        if (errorNode) {
          hasErrors = true;
          errorMsg = errorNode.messages[0].text;
        }
      }
      if (data.ui && data.ui.messages && data.ui.messages.length > 0) {
        hasErrors = true;
        errorMsg = data.ui.messages[0].text;
      }

      if (hasErrors || !submitRes.ok) {
        throw new Error(errorMsg || 'Verification rejected. Please ensure the code is correct.');
      }

      if (isAuthenticated) {
        setAuthError('Email verified successfully! Profile and feeds have been updated.');
        setIsEmailVerified(true);
        checkUserSubscription(sessionToken);
        fetchPrivateFeed(sessionToken);
      } else {
        setAuthMode('login');
        setAuthError('Account verified successfully! You can now log in.');
      }
      setVerificationCode('');
    } catch (err) {
      setAuthError(err.message);
    } finally {
      setIsVerifying(false);
    }
  };

  const handleLogout = () => {
    localStorage.removeItem('shortcat_token');
    setSessionToken('');
    setIsAuthenticated(false);
    setSubscriptionState({ active: false, entitlements: [] });
    setSelectedSeries(null);
    setSelectedEpisode(null);
    setProfileInfo(null);
    setBookmarks([]);
    setRewards(null);
    setDevices([]);
    fetchPublicCatalog();
  };

  // Load full profile details from getshortcat API
  const loadProfileData = async (token) => {
    if (!token) return;
    setIsProfileLoading(true);
    const headers = { 'Authorization': `Bearer ${token}` };
    
    try {
      // 1. Profile Info
      const profileRes = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://www.getshortcat.com/api/v1/profile')}`, { headers });
      if (profileRes.ok) {
        const profile = await profileRes.json().catch(() => null);
        setProfileInfo(profile);
      }

      // 2. Bookmarks List
      const bookmarksRes = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://www.getshortcat.com/api/v1/profile/bookmarks')}`, { headers });
      if (bookmarksRes.ok) {
        const bkData = await bookmarksRes.json().catch(() => null);
        if (bkData) {
          if (Array.isArray(bkData)) {
            setBookmarks(bkData);
          } else if (bkData.bookmarks) {
            setBookmarks(bkData.bookmarks);
          } else {
            setBookmarks([]);
          }
        } else {
          setBookmarks([]);
        }
      }

      // 3. Rewards
      const rewardsRes = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://www.getshortcat.com/api/v1/profile/rewards')}`, { headers });
      if (rewardsRes.ok) {
        const rwData = await rewardsRes.json().catch(() => null);
        setRewards(rwData);
      }

      // 4. Linked Devices
      const devicesRes = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://www.getshortcat.com/api/v1/profile/devices')}`, { headers });
      if (devicesRes.ok) {
        const devData = await devicesRes.json().catch(() => null);
        if (devData) {
          if (Array.isArray(devData)) {
            setDevices(devData);
          } else if (devData.devices) {
            setDevices(devData.devices);
          } else {
            setDevices([]);
          }
        } else {
          setDevices([]);
        }
      }
    } catch (err) {
      console.error("Error loading profile dataset:", err);
    } finally {
      setIsProfileLoading(false);
    }
  };

  // Upload custom profile picture avatar
  const handleUploadAvatar = async (e) => {
    const file = e.target.files?.[0];
    if (!file || !sessionToken) return;

    setIsUploadingAvatar(true);
    setAuthError('');
    try {
      const formData = new FormData();
      formData.append('user[picture]', file);

      // Submit picture binary using PUT on profile endpoint
      const res = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://www.getshortcat.com/api/v1/profile')}`, {
        method: 'PUT',
        headers: {
          'Authorization': `Bearer ${sessionToken}`
        },
        body: formData
      });

      if (res.ok) {
        setAuthError('Avatar updated successfully!');
        loadProfileData(sessionToken);
      } else {
        const errText = await res.text().catch(() => '');
        console.error("Avatar upload failed response:", res.status, errText);
        throw new Error(`Failed to upload avatar (Status ${res.status}): ${errText}`);
      }
    } catch (err) {
      setAuthError(err.message);
    } finally {
      setIsUploadingAvatar(false);
    }
  };

  // Submit Feedback / Support message
  const handleSubmitFeedback = async (e) => {
    e.preventDefault();
    if (!feedbackText || !sessionToken) return;

    setFeedbackSuccess('');
    try {
      const res = await fetch(`${proxyUrl}?url=${encodeURIComponent('https://www.getshortcat.com/api/v1/profile/feedbacks')}`, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          'Authorization': `Bearer ${sessionToken}`
        },
        body: JSON.stringify({
          feedback: {
            campaign: 'web_app_feedback',
            content: {
              body: feedbackText
            }
          }
        })
      });

      if (res.ok) {
        setFeedbackSuccess('Feedback submitted successfully! Thank you.');
        setFeedbackText('');
      } else {
        const errText = await res.text().catch(() => '');
        console.error("Feedback submission failed response:", res.status, errText);
        throw new Error(`Failed to submit feedback (Status ${res.status}): ${errText}`);
      }
    } catch (err) {
      setAuthError(err.message);
    }
  };

  // Play Video using Hls.js proxying for .m3u8 streams
  const playEpisode = async (episode) => {
    setPlayerError('');
    setSelectedEpisode(episode);
    setIsPlayerLoading(true);

    // Check if the stream requires premium entitlement access
    if (!episode.free && !subscriptionState.active) {
      setPlayerError('This episode requires an active premium/VIP subscription plan.');
      setIsPlayerLoading(false);
      return;
    }

    try {
      const episodeEndpoint = `https://www.getshortcat.com/api/v1/episodes/${episode.id}`;
      const headers = {};
      if (sessionToken) {
        headers['Authorization'] = `Bearer ${sessionToken}`;
      }
      const res = await fetch(`${proxyUrl}?url=${encodeURIComponent(episodeEndpoint)}`, { headers });
      if (!res.ok) {
        if (res.status === 402) {
          throw new Error('Payment Required: This episode requires a purchase or VIP membership.');
        }
        throw new Error(`Failed to load episode details (Status: ${res.status})`);
      }
      
      const data = await res.json();
      const epDetails = data.episode;
      if (!epDetails) {
        throw new Error('Episode data is missing from response.');
      }
      
      let relativeVideoUrl = epDetails.hlsVideo || epDetails.fallbackVideo;
      if (!relativeVideoUrl) {
        throw new Error('No streaming or fallback video URL found.');
      }
      
      let targetStream = relativeVideoUrl;
      if (targetStream.startsWith('/')) {
        targetStream = `https://www.getshortcat.com${targetStream}`;
      }
      
      // Update selected episode with retrieved target video url
      setSelectedEpisode(prev => ({
        ...prev,
        videoUrl: targetStream
      }));

      // Setup HLS / HTML5 Video player engine
      setTimeout(() => {
        const video = videoRef.current;
        if (!video) return;

        // Clean up previous instances
        if (window.hls) {
          window.hls.destroy();
        }

        // Check if it's an HLS playlist (requires compilation proxying to append headers)
        if (targetStream.includes('.m3u8')) {
          const proxiedStreamUrl = `${proxyUrl}?url=${encodeURIComponent(targetStream)}`;
          
          if (Hls.isSupported()) {
            const hls = new Hls({
              xhrSetup: (xhr, url) => {
                // Pass downstream Ory tokens to bypassed media proxy endpoints
                if (sessionToken) {
                  xhr.setRequestHeader('Authorization', `Bearer ${sessionToken}`);
                }
              }
            });
            hls.loadSource(proxiedStreamUrl);
            hls.attachMedia(video);
            window.hls = hls;

            hls.on(Hls.Events.MANIFEST_PARSED, () => {
              video.play();
              setIsPlaying(true);
              setIsPlayerLoading(false);
            });

            hls.on(Hls.Events.ERROR, (event, data) => {
              if (data.fatal) {
                setPlayerError('Failed to decode the live media stream. Segment retrieval issue.');
                setIsPlayerLoading(false);
              }
            });
          } else if (video.canPlayType('application/vnd.apple.mpegurl')) {
            // Native Safari fallback
            video.src = proxiedStreamUrl;
            video.addEventListener('loadedmetadata', () => {
              video.play();
              setIsPlaying(true);
              setIsPlayerLoading(false);
            });
          }
        } else {
          // Raw static MP4 preview asset
          video.src = targetStream;
          video.play()
            .then(() => {
              setIsPlaying(true);
              setIsPlayerLoading(false);
            })
            .catch(() => {
              setPlayerError('Direct media play request blocked by local policy.');
              setIsPlayerLoading(false);
            });
        }
      }, 100);
    } catch (err) {
      console.error('Error playing episode:', err);
      setPlayerError(err.message || 'Failed to play episode.');
      setIsPlayerLoading(false);
    }
  };

  // Video controls
  const togglePlay = () => {
    if (!videoRef.current) return;
    if (isPlaying) {
      videoRef.current.pause();
      setIsPlaying(false);
    } else {
      videoRef.current.play();
      setIsPlaying(true);
    }
  };

  const toggleMute = () => {
    if (!videoRef.current) return;
    videoRef.current.muted = !isMuted;
    setIsMuted(!isMuted);
  };

  const handleTimeUpdate = () => {
    if (!videoRef.current) return;
    setCurrentTime(videoRef.current.currentTime);
  };

  const handleLoadedMetadata = () => {
    if (!videoRef.current) return;
    setDuration(videoRef.current.duration);
  };

  const handleProgressChange = (e) => {
    if (!videoRef.current) return;
    const time = parseFloat(e.target.value);
    videoRef.current.currentTime = time;
    setCurrentTime(time);
  };

  if (!isAuthenticated) {
    return (
      <div className="min-h-screen bg-[#0b0c10] text-[#f1f3f5] relative flex items-center justify-center p-4">
        {/* Ambient background glows */}
        <div className="absolute top-1/4 left-1/4 w-[400px] h-[400px] bg-indigo-500/10 rounded-full blur-[100px] pointer-events-none" />
        <div className="absolute bottom-1/4 right-1/4 w-[400px] h-[400px] bg-emerald-500/5 rounded-full blur-[100px] pointer-events-none" />

        <div className="w-full max-w-md bg-slate-900/60 border border-white/5 backdrop-blur-xl p-8 rounded-2xl space-y-6 shadow-2xl relative">
          <div className="flex flex-col items-center text-center space-y-3">
            <div className="w-12 h-12 bg-indigo-500/10 rounded-xl border border-indigo-500/20 flex items-center justify-center">
              <Film className="w-6 h-6 text-indigo-500 animate-pulse" />
            </div>
            <h1 className="text-3xl font-extrabold tracking-wider bg-gradient-to-r from-indigo-400 via-indigo-500 to-emerald-400 bg-clip-text text-transparent">
              SHORTCAT
            </h1>
            <p className="text-xs text-white/50">
              Web Console - Sign in to access your private anime feed
            </p>
          </div>

          <form onSubmit={handleAuth} className="space-y-4 pt-2">
            {authError && (
              <div className="p-3.5 bg-rose-500/10 border border-rose-500/20 rounded-xl flex items-start gap-2.5">
                <ShieldAlert className="w-4.5 h-4.5 text-rose-500 shrink-0 mt-0.5" />
                <span className="text-xs text-rose-400 leading-normal">{authError}</span>
              </div>
            )}

            <div className="space-y-1.5">
              <label className="text-xs font-semibold text-white/60">Email Address</label>
              <input 
                type="email"
                required
                suppressHydrationWarning
                placeholder="Enter Kratos profile email"
                value={loginEmail}
                onChange={(e) => setLoginEmail(e.target.value)}
                className="w-full px-4 py-2.5 bg-black/40 border border-white/5 rounded-xl text-sm placeholder-white/20 focus:border-indigo-500/50 outline-none transition text-white"
              />
            </div>

            <div className="space-y-1.5">
              <label className="text-xs font-semibold text-white/60">Password</label>
              <input 
                type="password"
                required
                suppressHydrationWarning
                placeholder="Enter account password"
                value={loginPassword}
                onChange={(e) => setLoginPassword(e.target.value)}
                className="w-full px-4 py-2.5 bg-black/40 border border-white/5 rounded-xl text-sm placeholder-white/20 focus:border-indigo-500/50 outline-none transition text-white"
              />
            </div>

            <button 
              type="submit"
              disabled={isAuthLoading}
              className="w-full py-3 bg-indigo-500 hover:bg-indigo-600 disabled:bg-indigo-500/50 text-white rounded-xl font-bold text-sm transition flex items-center justify-center gap-2 mt-2 shadow-lg shadow-indigo-500/20"
            >
              {isAuthLoading ? <Loader className="w-4 h-4 animate-spin" /> : authMode === 'login' ? 'Sign In' : 'Create Account'}
            </button>

            <div className="text-center pt-2">
              <button
                type="button"
                onClick={() => {
                  setAuthMode(authMode === 'login' ? 'signup' : 'login');
                  setAuthError('');
                }}
                className="text-xs text-indigo-400 hover:text-indigo-300 font-semibold transition"
              >
                {authMode === 'login' ? "Don't have an account? Sign Up" : 'Already have an account? Log In'}
              </button>
            </div>
          </form>

          <p className="text-[10px] text-white/30 text-center leading-normal border-t border-white/5 pt-4">
            Identity verification hosted on: <br />
            <span className="font-mono text-white/40">auth.k.prod.sinj.net</span>
          </p>
        </div>
      </div>
    );
  }

  return (
    <div className="min-h-screen bg-[#0b0c10] text-[#f1f3f5] relative">
      {/* Dynamic Aurora Ambient Backgrounds */}
      <div className="absolute top-0 left-1/4 w-[500px] h-[500px] bg-indigo-500/10 rounded-full blur-[120px] pointer-events-none -z-10" />
      <div className="absolute bottom-10 right-1/4 w-[600px] h-[600px] bg-emerald-500/5 rounded-full blur-[150px] pointer-events-none -z-10" />

      {/* Header bar */}
      <header className="sticky top-0 z-50 border-b border-white/5 bg-[#0b0c10]/80 backdrop-blur-md px-6 py-4 flex items-center justify-between">
        <div className="flex items-center space-x-3">
          <Film className="w-8 h-8 text-indigo-500 animate-pulse" />
          <span className="text-2xl font-extrabold tracking-wider bg-gradient-to-r from-indigo-400 via-indigo-500 to-emerald-400 bg-clip-text text-transparent">
            SHORTCAT
          </span>
          <span className="text-xs px-2 py-0.5 rounded-full bg-indigo-500/10 text-indigo-400 font-mono border border-indigo-500/20">
            WEB CONSOLE
          </span>
        </div>

        <div className="flex items-center space-x-6">
          <button 
            onClick={() => setActiveView('browse')}
            className={`text-sm font-semibold transition ${activeView === 'browse' ? 'text-indigo-400' : 'text-white/60 hover:text-white'}`}
          >
            Browse Catalogs
          </button>
          <button 
            onClick={() => setActiveView('profile')}
            className={`text-sm font-semibold transition ${activeView === 'profile' ? 'text-indigo-400' : 'text-white/60 hover:text-white'}`}
          >
            Profile Console
          </button>

          <div className="flex items-center space-x-4 border-l border-white/10 pl-6">
            {subscriptionState.active ? (
              <span className="flex items-center text-xs px-3 py-1 rounded-full bg-emerald-500/10 text-emerald-400 border border-emerald-500/20 font-semibold gap-1.5">
                <ShieldCheck className="w-3.5 h-3.5" /> PREMIUM VIP
              </span>
            ) : (
              <span className="text-xs px-3 py-1 rounded-full bg-white/5 text-white/50 border border-white/10 font-semibold">
                FREE ACCESS
              </span>
            )}
            <button 
              onClick={handleLogout}
              className="text-sm px-4 py-2 rounded-lg bg-white/5 hover:bg-white/10 border border-white/10 transition duration-200"
            >
              Log Out
            </button>
          </div>
        </div>
      </header>

      {/* Main Grid Workspace */}
      <main className="max-w-7xl mx-auto px-6 py-8">
        
        {activeView === 'browse' ? (
          <div className="grid grid-cols-1 lg:grid-cols-12 gap-8">
            {/* Left Side: Feed Catalog and Video player */}
            <section className="lg:col-span-9 space-y-8">
              {/* Active Player Panel */}
              {selectedEpisode ? (
                <div className="glow-card rounded-2xl overflow-hidden border border-white/5 relative">
                  <div className="aspect-video bg-black/40 relative flex items-center justify-center">
                    
                    {isPlayerLoading && (
                      <div className="absolute inset-0 z-20 bg-black/85 flex flex-col items-center justify-center space-y-3">
                        <Loader className="w-10 h-10 text-indigo-500 animate-spin" />
                        <span className="text-sm text-white/60">Fetching decrypted segments...</span>
                      </div>
                    )}

                    {playerError ? (
                      <div className="absolute inset-0 z-20 bg-black/90 flex flex-col items-center justify-center p-6 text-center space-y-4">
                        <ShieldAlert className="w-16 h-16 text-rose-500 animate-bounce" />
                        <h3 className="text-xl font-bold">Content Guard Access Denied</h3>
                        <p className="text-sm text-white/60 max-w-md">{playerError}</p>
                      </div>
                    ) : null}

                    <video 
                      ref={videoRef}
                      onTimeUpdate={handleTimeUpdate}
                      onLoadedMetadata={handleLoadedMetadata}
                      className="w-full h-full object-contain"
                      playsInline
                    />
                  </div>

                  {/* Player UI Controls */}
                  <div className="px-6 py-4 bg-slate-900/60 border-t border-white/5 flex flex-col space-y-3">
                    <div className="flex items-center justify-between">
                      <div>
                        <span className="text-xs text-indigo-400 font-semibold uppercase tracking-wider">Now Playing</span>
                        <h2 className="text-lg font-bold">{selectedEpisode.title}</h2>
                      </div>
                      <span className="text-xs px-2.5 py-1 rounded-md bg-white/5 text-white/60 font-mono">
                        HLS Streaming Bypass (Referer spoof active)
                      </span>
                    </div>

                    {/* Progress bar */}
                    <div className="flex items-center space-x-3">
                      <span className="text-xs font-mono text-white/40">
                        {Math.floor(currentTime / 60)}:{( '0' + Math.floor(currentTime % 60) ).slice(-2)}
                      </span>
                      <input 
                        type="range"
                        min="0"
                        max={duration || 100}
                        value={currentTime}
                        onChange={handleProgressChange}
                        className="flex-1 accent-indigo-500 h-1 rounded-lg cursor-pointer bg-white/10"
                      />
                      <span className="text-xs font-mono text-white/40">
                        {Math.floor(duration / 60)}:{( '0' + Math.floor(duration % 60) ).slice(-2)}
                      </span>
                    </div>

                    {/* Controls Bar */}
                    <div className="flex items-center justify-between pt-1">
                      <div className="flex items-center space-x-4">
                        <button onClick={togglePlay} className="p-2 rounded-lg bg-white/5 hover:bg-white/10 transition">
                          {isPlaying ? <Pause className="w-5 h-5" /> : <Play className="w-5 h-5 text-indigo-400 fill-indigo-400" />}
                        </button>
                        <button onClick={toggleMute} className="p-2 rounded-lg bg-white/5 hover:bg-white/10 transition">
                          {isMuted ? <VolumeX className="w-5 h-5 text-rose-400" /> : <Volume2 className="w-5 h-5" />}
                        </button>
                      </div>
                      <button 
                        onClick={() => videoRef.current?.requestFullscreen()}
                        className="p-2 rounded-lg bg-white/5 hover:bg-white/10 transition"
                      >
                        <Maximize className="w-5 h-5" />
                      </button>
                    </div>
                  </div>
                </div>
              ) : (
                <div className="glow-card rounded-2xl p-12 text-center border border-white/5 flex flex-col items-center space-y-4">
                  <Tv className="w-16 h-16 text-indigo-500/40" />
                  <h2 className="text-2xl font-bold">Select a Drama Episode to Stream</h2>
                  <p className="text-sm text-white/50 max-w-md">
                    Stream decompiled micro-episodes directly through the custom spoofy proxy. Select any item from the catalog feed below to launch the video player engine.
                  </p>
                </div>
              )}

              {/* Show Catalog Feed list */}
              <div className="space-y-6">
                <h3 className="text-xl font-bold flex items-center gap-2">
                  <Compass className="w-5 h-5 text-indigo-400" /> Available Show Catalogs
                </h3>

                {isCatalogLoading ? (
                  <div className="flex items-center justify-center py-12">
                    <Loader className="w-8 h-8 text-indigo-500 animate-spin" />
                  </div>
                ) : (
                  <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
                    {catalogItems.map((series) => (
                      <div 
                        key={series.id}
                        onClick={() => loadSeriesDetails(series)}
                        className={`glow-card rounded-xl overflow-hidden border cursor-pointer p-4 space-y-4 ${selectedSeries?.id === series.id ? 'border-indigo-500/50 bg-indigo-500/5' : 'border-white/5'}`}
                      >
                        <div className="aspect-video rounded-lg bg-slate-800/80 overflow-hidden relative">
                          <img 
                            src={series.thumbnailUrl ? (series.thumbnailUrl.startsWith('data:') ? series.thumbnailUrl : `${proxyUrl}?url=${encodeURIComponent(series.thumbnailUrl)}`) : getPlaceholderSvg('No Thumbnail')} 
                            alt={series.title}
                            className="w-full h-full object-cover transform hover:scale-105 transition duration-300"
                            onError={(e) => {
                              e.target.src = getPlaceholderSvg('Thumbnail Not Found');
                            }}
                          />
                          <span className="absolute top-2 right-2 px-2 py-0.5 text-[10px] font-semibold bg-black/60 rounded backdrop-blur">
                            {series.episodes?.length || 1} Ep
                          </span>
                        </div>

                        <div>
                          <h4 className="font-bold text-base line-clamp-1">{series.title}</h4>
                          <p className="text-xs text-white/50 mt-1 line-clamp-2">{series.description || 'Decompiled series payload.'}</p>
                        </div>
                      </div>
                    ))}
                  </div>
                )}
              </div>
            </section>

            {/* Right Side: Selected Series Episode List & Console Status */}
            <section className="lg:col-span-3 space-y-6">
              {selectedSeries ? (
                <div className="glow-card rounded-xl p-5 border border-white/5 space-y-4">
                  <div className="flex justify-between items-center pb-2 border-b border-white/5">
                    <div>
                      <span className="text-[10px] text-indigo-400 font-semibold uppercase tracking-wider">Series Selection</span>
                      <h3 className="font-bold text-sm line-clamp-1">{selectedSeries.title}</h3>
                    </div>
                    <button 
                      onClick={() => setSelectedSeries(null)}
                      className="text-[10px] text-white/40 hover:text-white"
                    >
                      Clear
                    </button>
                  </div>

                  <div className="space-y-2 max-h-[480px] overflow-y-auto pr-1">
                    {selectedSeries.episodes?.map((ep, idx) => (
                      <div 
                        key={ep.id}
                        className="p-2.5 bg-white/5 hover:bg-white/10 border border-white/5 rounded-lg flex items-center justify-between transition duration-150"
                      >
                        <div className="flex items-center space-x-2.5 min-w-0">
                          <span className="text-xs font-mono text-white/30">{idx + 1}</span>
                          <div className="min-w-0">
                            <h5 className="font-bold text-xs truncate">{ep.title}</h5>
                            <span className="text-[10px] text-white/40 font-mono">{ep.durationSeconds || 60}s</span>
                          </div>
                        </div>

                        <div className="flex items-center space-x-2 shrink-0">
                          {!ep.free && !subscriptionState.active && (
                            <Lock className="w-3 h-3 text-amber-400 shrink-0" />
                          )}
                          <button 
                            onClick={() => playEpisode(ep)}
                            className="px-2 py-1 bg-indigo-500 hover:bg-indigo-600 text-[10px] font-semibold rounded transition"
                          >
                            Play
                          </button>
                        </div>
                      </div>
                    ))}
                  </div>
                </div>
              ) : (
                <div className="glow-card rounded-xl p-6 border border-white/5 text-center space-y-3">
                  <Tv className="w-10 h-10 text-indigo-500/30 mx-auto" />
                  <h4 className="font-bold text-xs">No Series Selected</h4>
                  <p className="text-[10px] text-white/40">Select a catalog from the list on the left to view and play specific episodes.</p>
                </div>
              )}
            </section>
          </div>
        ) : (
          /* Profile Page view */
          <div className="glow-card rounded-2xl p-8 border border-white/5 space-y-8 max-w-4xl mx-auto">
            
            {/* Header Avatar and Upload Section */}
            <div className="flex items-center space-x-4 pb-6 border-b border-white/5">
              <div className="relative group cursor-pointer w-16 h-16 rounded-full overflow-hidden border border-indigo-500/30 bg-slate-800 flex items-center justify-center shrink-0">
                {profileInfo?.user?.picture?.large ? (
                  <img 
                    src={profileInfo.user.picture.large.startsWith('data:') || profileInfo.user.picture.large.startsWith('http')
                      ? profileInfo.user.picture.large
                      : `${proxyUrl}?url=${encodeURIComponent('https://www.getshortcat.com' + profileInfo.user.picture.large)}`} 
                    alt="Profile Avatar"
                    className="w-full h-full object-cover"
                  />
                ) : (
                  <span className="text-2xl font-bold text-indigo-400">
                    {loginEmail ? loginEmail[0].toUpperCase() : 'U'}
                  </span>
                )}
                
                {isUploadingAvatar ? (
                  <div className="absolute inset-0 bg-black/75 flex items-center justify-center">
                    <Loader className="w-5 h-5 text-indigo-400 animate-spin" />
                  </div>
                ) : (
                  <label className="absolute inset-0 bg-black/60 rounded-full flex items-center justify-center text-[10px] font-bold text-white opacity-0 group-hover:opacity-100 cursor-pointer transition">
                    Upload
                    <input type="file" accept="image/*" onChange={handleUploadAvatar} className="hidden" />
                  </label>
                )}
              </div>
              <div>
                <h2 className="text-xl font-bold text-white">{profileInfo?.user?.name || loginEmail || 'User Session'}</h2>
                <span className="text-xs px-2.5 py-0.5 rounded bg-emerald-500/10 text-emerald-400 border border-emerald-500/20 font-mono font-semibold">
                  Authenticated Session Active
                </span>
              </div>
            </div>

            <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
              {/* Entitlements & Rewards card */}
              <div className="space-y-2">
                <h4 className="text-xs font-semibold text-white/50 uppercase tracking-wider">Entitlements & Rewards</h4>
                <div className="p-4 rounded-xl bg-slate-900/40 border border-white/5 space-y-3">
                  <div className="flex items-center justify-between">
                    <span className="text-xs text-white/60">Subscription State</span>
                    {subscriptionState.active ? (
                      <span className="text-xs px-2 py-0.5 rounded bg-emerald-500/10 text-emerald-400 font-bold">PREMIUM VIP</span>
                    ) : (
                      <span className="text-xs px-2 py-0.5 rounded bg-white/5 text-white/40">FREE ACCESS</span>
                    )}
                  </div>
                  {subscriptionState.entitlements.length > 0 && (
                    <div className="flex items-center justify-between">
                      <span className="text-xs text-white/60">Active products</span>
                      <span className="text-xs font-mono text-white/80">{subscriptionState.entitlements.join(', ')}</span>
                    </div>
                  )}
                  
                  <div className="flex items-center justify-between border-t border-white/5 pt-3">
                    <span className="text-xs text-white/60">Loyalty Coins Balance</span>
                    <span className="text-sm font-bold text-indigo-400 font-mono">{rewards?.coins ?? 0} Coins</span>
                  </div>

                  <button 
                    onClick={() => {
                      checkUserSubscription(sessionToken);
                      loadProfileData(sessionToken);
                    }}
                    disabled={isSubLoading}
                    className="w-full mt-2 py-2 bg-indigo-500/10 hover:bg-indigo-500/20 text-indigo-400 border border-indigo-500/20 rounded-lg text-xs font-semibold flex items-center justify-center gap-1.5 transition"
                  >
                    {isSubLoading ? <Loader className="w-3.5 h-3.5 animate-spin" /> : <RefreshCw className="w-3.5 h-3.5" />} Re-sync Subscription Status
                  </button>
                </div>
              </div>

              {/* Security info card */}
              <div className="space-y-2">
                <h4 className="text-xs font-semibold text-white/50 uppercase tracking-wider">Session Security</h4>
                <div className="p-4 rounded-xl bg-slate-900/40 border border-white/5 space-y-3">
                  <div className="flex items-center justify-between">
                    <span className="text-xs text-white/60">Provider Endpoint</span>
                    <span className="text-xs font-mono text-white/40">auth.k.prod.sinj.net</span>
                  </div>
                  <div className="flex items-center justify-between">
                    <span className="text-xs text-white/60">Authentication Strategy</span>
                    <span className="text-xs text-white/80">Ory Kratos API Flow</span>
                  </div>
                  <div className="flex items-center justify-between border-t border-white/5 pt-3">
                    <span className="text-xs text-white/60">Kratos Profile ID</span>
                    <span className="text-[10px] font-mono text-white/50 max-w-[180px] truncate">{profileInfo?.user?.id || 'Pending loading...'}</span>
                  </div>
                </div>
              </div>
            </div>

            {/* Bookmarks Section */}
            <div className="space-y-3 pt-2">
              <h4 className="text-xs font-semibold text-white/50 uppercase tracking-wider">My Bookmarked Shows ({bookmarks.length})</h4>
              {bookmarks.length > 0 ? (
                <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-4">
                  {bookmarks.map((series) => (
                    <div key={series.id} className="p-3 bg-white/5 border border-white/5 rounded-xl flex items-center space-x-3">
                      <div className="w-10 h-10 rounded bg-slate-800 overflow-hidden shrink-0">
                        <img 
                          src={series.thumbnailUrl ? (series.thumbnailUrl.startsWith('data:') ? series.thumbnailUrl : `${proxyUrl}?url=${encodeURIComponent(series.thumbnailUrl)}`) : getPlaceholderSvg('Show')} 
                          alt={series.name || series.title}
                          className="w-full h-full object-cover"
                          onError={(e) => { e.target.src = getPlaceholderSvg('Show'); }}
                        />
                      </div>
                      <div className="min-w-0">
                        <h5 className="font-semibold text-xs truncate text-white">{series.name || series.title || 'Bookmarked Series'}</h5>
                        <span className="text-[9px] text-white/40">Saved Catalog</span>
                      </div>
                    </div>
                  ))}
                </div>
              ) : (
                <p className="text-xs text-white/40 italic">No bookmarked anime series found.</p>
              )}
            </div>

            {/* Devices Section */}
            <div className="space-y-3 pt-2">
              <h4 className="text-xs font-semibold text-white/50 uppercase tracking-wider">Linked Devices / Active Sessions ({devices.length || 1})</h4>
              {devices.length > 0 ? (
                <div className="space-y-2">
                  {devices.map((dev) => (
                    <div key={dev.id} className="p-3 bg-white/5 border border-white/5 rounded-xl flex items-center justify-between font-mono text-[10px] text-white/60">
                      <span className="truncate">{dev.deviceName || dev.name || 'Active Session Device'}</span>
                      <span className="text-white/40">Last Active: {dev.lastActive ? new Date(dev.lastActive).toLocaleDateString() : 'Now'}</span>
                    </div>
                  ))}
                </div>
              ) : (
                <div className="p-3 bg-white/5 border border-white/5 rounded-xl flex items-center justify-between font-mono text-[10px] text-white/60">
                  <span>Web Console (auth.k.prod.sinj.net session)</span>
                  <span className="text-white/40">Active Now</span>
                </div>
              )}
            </div>

            {/* JWT Bearer Token Section */}
            <div className="space-y-2 pt-2">
              <label className="text-xs font-semibold text-white/50 uppercase tracking-wider">Active JWT Bearer Token</label>
              <div className="relative">
                <textarea 
                  readOnly 
                  value={sessionToken}
                  className="w-full text-xs p-4 rounded-xl bg-black/40 border border-white/5 font-mono h-32 select-all outline-none resize-none text-white/85 text-center font-bold"
                />
                <span className="absolute bottom-3 right-3 text-[10px] bg-slate-800 text-white/40 px-2 py-1 rounded border border-white/5">
                  Click to select all
                </span>
              </div>
            </div>

            {/* Feedback Submission Form */}
            <form onSubmit={handleSubmitFeedback} className="space-y-2.5 pt-4 border-t border-white/5">
              <h4 className="text-xs font-semibold text-white/50 uppercase tracking-wider">Submit User Feedback / Support Request</h4>
              {feedbackSuccess && (
                <div className="p-3 bg-emerald-500/10 border border-emerald-500/20 rounded-xl flex items-start gap-2.5">
                  <CheckCircle className="w-4 h-4 text-emerald-400 mt-0.5 shrink-0" />
                  <span className="text-xs text-emerald-300 leading-normal">{feedbackSuccess}</span>
                </div>
              )}
              <div className="flex gap-2">
                <input 
                  type="text"
                  required
                  placeholder="Describe your issue or feedback here..."
                  value={feedbackText}
                  onChange={(e) => setFeedbackText(e.target.value)}
                  className="flex-1 px-4 py-2 bg-black/40 border border-white/5 rounded-xl text-xs placeholder-white/20 text-white outline-none focus:border-indigo-500/50"
                />
                <button 
                  type="submit"
                  className="px-4 py-2 bg-indigo-500 hover:bg-indigo-600 text-white text-xs font-semibold rounded-xl transition"
                >
                  Submit Feedback
                </button>
              </div>
            </form>
          </div>
        )}

      </main>
    </div>
  );
}
