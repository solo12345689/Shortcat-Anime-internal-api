package com.google.android.gms.measurement.internal;

import com.adjust.sdk.Constants;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3789d2 {

    /* JADX INFO: renamed from: A */
    public static final C3781c2 f41141A;

    /* JADX INFO: renamed from: A0 */
    public static final C3781c2 f41142A0;

    /* JADX INFO: renamed from: B */
    public static final C3781c2 f41143B;

    /* JADX INFO: renamed from: B0 */
    public static final C3781c2 f41144B0;

    /* JADX INFO: renamed from: C */
    public static final C3781c2 f41145C;

    /* JADX INFO: renamed from: C0 */
    public static final C3781c2 f41146C0;

    /* JADX INFO: renamed from: D */
    public static final C3781c2 f41147D;

    /* JADX INFO: renamed from: D0 */
    public static final C3781c2 f41148D0;

    /* JADX INFO: renamed from: E */
    public static final C3781c2 f41149E;

    /* JADX INFO: renamed from: E0 */
    public static final C3781c2 f41150E0;

    /* JADX INFO: renamed from: F */
    public static final C3781c2 f41151F;

    /* JADX INFO: renamed from: F0 */
    public static final C3781c2 f41152F0;

    /* JADX INFO: renamed from: G */
    public static final C3781c2 f41153G;

    /* JADX INFO: renamed from: G0 */
    public static final C3781c2 f41154G0;

    /* JADX INFO: renamed from: H */
    public static final C3781c2 f41155H;

    /* JADX INFO: renamed from: H0 */
    public static final C3781c2 f41156H0;

    /* JADX INFO: renamed from: I */
    public static final C3781c2 f41157I;

    /* JADX INFO: renamed from: I0 */
    public static final C3781c2 f41158I0;

    /* JADX INFO: renamed from: J */
    public static final C3781c2 f41159J;

    /* JADX INFO: renamed from: J0 */
    public static final C3781c2 f41160J0;

    /* JADX INFO: renamed from: K */
    public static final C3781c2 f41161K;

    /* JADX INFO: renamed from: K0 */
    public static final C3781c2 f41162K0;

    /* JADX INFO: renamed from: L */
    public static final C3781c2 f41163L;

    /* JADX INFO: renamed from: L0 */
    public static final C3781c2 f41164L0;

    /* JADX INFO: renamed from: M */
    public static final C3781c2 f41165M;

    /* JADX INFO: renamed from: M0 */
    public static final C3781c2 f41166M0;

    /* JADX INFO: renamed from: N */
    public static final C3781c2 f41167N;

    /* JADX INFO: renamed from: N0 */
    public static final C3781c2 f41168N0;

    /* JADX INFO: renamed from: O */
    public static final C3781c2 f41169O;

    /* JADX INFO: renamed from: O0 */
    public static final C3781c2 f41170O0;

    /* JADX INFO: renamed from: P */
    public static final C3781c2 f41171P;

    /* JADX INFO: renamed from: P0 */
    public static final C3781c2 f41172P0;

    /* JADX INFO: renamed from: Q */
    public static final C3781c2 f41173Q;

    /* JADX INFO: renamed from: Q0 */
    public static final C3781c2 f41174Q0;

    /* JADX INFO: renamed from: R */
    public static final C3781c2 f41175R;

    /* JADX INFO: renamed from: R0 */
    public static final C3781c2 f41176R0;

    /* JADX INFO: renamed from: S */
    public static final C3781c2 f41177S;

    /* JADX INFO: renamed from: S0 */
    public static final C3781c2 f41178S0;

    /* JADX INFO: renamed from: T */
    public static final C3781c2 f41179T;

    /* JADX INFO: renamed from: T0 */
    public static final C3781c2 f41180T0;

    /* JADX INFO: renamed from: U */
    public static final C3781c2 f41181U;

    /* JADX INFO: renamed from: U0 */
    public static final C3781c2 f41182U0;

    /* JADX INFO: renamed from: V */
    public static final C3781c2 f41183V;

    /* JADX INFO: renamed from: V0 */
    public static final C3781c2 f41184V0;

    /* JADX INFO: renamed from: W */
    public static final C3781c2 f41185W;

    /* JADX INFO: renamed from: W0 */
    public static final C3781c2 f41186W0;

    /* JADX INFO: renamed from: X */
    public static final C3781c2 f41187X;

    /* JADX INFO: renamed from: X0 */
    public static final C3781c2 f41188X0;

    /* JADX INFO: renamed from: Y */
    public static final C3781c2 f41189Y;

    /* JADX INFO: renamed from: Y0 */
    public static final C3781c2 f41190Y0;

    /* JADX INFO: renamed from: Z */
    public static final C3781c2 f41191Z;

    /* JADX INFO: renamed from: Z0 */
    public static final C3781c2 f41192Z0;

    /* JADX INFO: renamed from: a */
    private static final List f41193a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a0 */
    public static final C3781c2 f41194a0;

    /* JADX INFO: renamed from: a1 */
    public static final C3781c2 f41195a1;

    /* JADX INFO: renamed from: b */
    public static final C3781c2 f41196b;

    /* JADX INFO: renamed from: b0 */
    public static final C3781c2 f41197b0;

    /* JADX INFO: renamed from: b1 */
    public static final C3781c2 f41198b1;

    /* JADX INFO: renamed from: c */
    public static final C3781c2 f41199c;

    /* JADX INFO: renamed from: c0 */
    public static final C3781c2 f41200c0;

    /* JADX INFO: renamed from: c1 */
    public static final C3781c2 f41201c1;

    /* JADX INFO: renamed from: d */
    public static final C3781c2 f41202d;

    /* JADX INFO: renamed from: d0 */
    public static final C3781c2 f41203d0;

    /* JADX INFO: renamed from: d1 */
    public static final C3781c2 f41204d1;

    /* JADX INFO: renamed from: e */
    public static final C3781c2 f41205e;

    /* JADX INFO: renamed from: e0 */
    public static final C3781c2 f41206e0;

    /* JADX INFO: renamed from: e1 */
    public static final C3781c2 f41207e1;

    /* JADX INFO: renamed from: f */
    public static final C3781c2 f41208f;

    /* JADX INFO: renamed from: f0 */
    public static final C3781c2 f41209f0;

    /* JADX INFO: renamed from: f1 */
    public static final C3781c2 f41210f1;

    /* JADX INFO: renamed from: g */
    public static final C3781c2 f41211g;

    /* JADX INFO: renamed from: g0 */
    public static final C3781c2 f41212g0;

    /* JADX INFO: renamed from: g1 */
    public static final C3781c2 f41213g1;

    /* JADX INFO: renamed from: h */
    public static final C3781c2 f41214h;

    /* JADX INFO: renamed from: h0 */
    public static final C3781c2 f41215h0;

    /* JADX INFO: renamed from: h1 */
    public static final C3781c2 f41216h1;

    /* JADX INFO: renamed from: i */
    public static final C3781c2 f41217i;

    /* JADX INFO: renamed from: i0 */
    public static final C3781c2 f41218i0;

    /* JADX INFO: renamed from: i1 */
    public static final C3781c2 f41219i1;

    /* JADX INFO: renamed from: j */
    public static final C3781c2 f41220j;

    /* JADX INFO: renamed from: j0 */
    public static final C3781c2 f41221j0;

    /* JADX INFO: renamed from: j1 */
    public static final C3781c2 f41222j1;

    /* JADX INFO: renamed from: k */
    public static final C3781c2 f41223k;

    /* JADX INFO: renamed from: k0 */
    public static final C3781c2 f41224k0;

    /* JADX INFO: renamed from: k1 */
    public static final C3781c2 f41225k1;

    /* JADX INFO: renamed from: l */
    public static final C3781c2 f41226l;

    /* JADX INFO: renamed from: l0 */
    public static final C3781c2 f41227l0;

    /* JADX INFO: renamed from: l1 */
    public static final C3781c2 f41228l1;

    /* JADX INFO: renamed from: m */
    public static final C3781c2 f41229m;

    /* JADX INFO: renamed from: m0 */
    public static final C3781c2 f41230m0;

    /* JADX INFO: renamed from: n */
    public static final C3781c2 f41231n;

    /* JADX INFO: renamed from: n0 */
    public static final C3781c2 f41232n0;

    /* JADX INFO: renamed from: o */
    public static final C3781c2 f41233o;

    /* JADX INFO: renamed from: o0 */
    public static final C3781c2 f41234o0;

    /* JADX INFO: renamed from: p */
    public static final C3781c2 f41235p;

    /* JADX INFO: renamed from: p0 */
    public static final C3781c2 f41236p0;

    /* JADX INFO: renamed from: q */
    public static final C3781c2 f41237q;

    /* JADX INFO: renamed from: q0 */
    public static final C3781c2 f41238q0;

    /* JADX INFO: renamed from: r */
    public static final C3781c2 f41239r;

    /* JADX INFO: renamed from: r0 */
    public static final C3781c2 f41240r0;

    /* JADX INFO: renamed from: s */
    public static final C3781c2 f41241s;

    /* JADX INFO: renamed from: s0 */
    public static final C3781c2 f41242s0;

    /* JADX INFO: renamed from: t */
    public static final C3781c2 f41243t;

    /* JADX INFO: renamed from: t0 */
    public static final C3781c2 f41244t0;

    /* JADX INFO: renamed from: u */
    public static final C3781c2 f41245u;

    /* JADX INFO: renamed from: u0 */
    public static final C3781c2 f41246u0;

    /* JADX INFO: renamed from: v */
    public static final C3781c2 f41247v;

    /* JADX INFO: renamed from: v0 */
    public static final C3781c2 f41248v0;

    /* JADX INFO: renamed from: w */
    public static final C3781c2 f41249w;

    /* JADX INFO: renamed from: w0 */
    public static final C3781c2 f41250w0;

    /* JADX INFO: renamed from: x */
    public static final C3781c2 f41251x;

    /* JADX INFO: renamed from: x0 */
    public static final C3781c2 f41252x0;

    /* JADX INFO: renamed from: y */
    public static final C3781c2 f41253y;

    /* JADX INFO: renamed from: y0 */
    public static final C3781c2 f41254y0;

    /* JADX INFO: renamed from: z */
    public static final C3781c2 f41255z;

    /* JADX INFO: renamed from: z0 */
    public static final C3781c2 f41256z0;

    static {
        Collections.synchronizedSet(new HashSet());
        f41196b = a("measurement.ad_id_cache_time", 10000L, 10000L, V1.f40993a, false);
        f41199c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, O.f40882a, false);
        f41202d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C3819h0.f41335a, false);
        f41205e = a("measurement.config.cache_time", 86400000L, 3600000L, C3898s0.f41583a, false);
        f41208f = a("measurement.config.url_scheme", Constants.SCHEME, Constants.SCHEME, E0.f40712a, false);
        f41211g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", P0.f40895a, false);
        f41214h = a("measurement.upload.max_bundles", 100, 100, C3764a1.f41089a, false);
        f41217i = a("measurement.upload.max_batch_size", 65536, 65536, C3858m1.f41424a, false);
        f41220j = a("measurement.upload.max_bundle_size", 65536, 65536, C3934x1.f41742a, false);
        f41223k = a("measurement.upload.max_events_per_bundle", 1000, 1000, J1.f40814a, false);
        f41226l = a("measurement.upload.max_events_per_day", 100000, 100000, U1.f40984a, false);
        f41229m = a("measurement.upload.max_error_events_per_day", 1000, 1000, W.f41003a, false);
        f41231n = a("measurement.upload.max_public_events_per_day", 50000, 50000, X.f41011a, false);
        Integer numValueOf = Integer.valueOf(ColorExtractionConstants.MAX_PIXEL_SAMPLES);
        f41233o = a("measurement.upload.max_conversions_per_day", numValueOf, numValueOf, Y.f41056a, false);
        f41235p = a("measurement.upload.max_realtime_events_per_day", 10, 10, Z.f41070a, false);
        f41237q = a("measurement.store.max_stored_events_per_app", 100000, 100000, C3763a0.f41088a, false);
        f41239r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C3779c0.f41117a, false);
        f41241s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", "https://app-measurement.com/s/d", C3787d0.f41139a, false);
        f41243t = a("measurement.sgtm.service_upload_apps_list", "", "", C3795e0.f41270a, false);
        f41245u = a("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", "404,429,503,504", C3803f0.f41284a, false);
        Long lValueOf = Long.valueOf(HTTPTimeoutManager.TIMEOUT_RESET_INTERVAL_MS);
        f41247v = a("measurement.sgtm.upload.retry_interval", lValueOf, lValueOf, C3811g0.f41304a, false);
        f41249w = a("measurement.sgtm.upload.retry_max_wait", 21600000L, 21600000L, C3827i0.f41362a, false);
        f41251x = a("measurement.sgtm.batch.retry_interval", 1800000L, 1800000L, C3835j0.f41377a, false);
        f41253y = a("measurement.sgtm.batch.retry_max_wait", 21600000L, 21600000L, C3843k0.f41394a, false);
        f41255z = a("measurement.sgtm.batch.retry_max_count", 10, 10, C3850l0.f41409a, false);
        f41141A = a("measurement.sgtm.upload.max_queued_batches", 5000, 5000, C3857m0.f41423a, false);
        f41143B = a("measurement.sgtm.upload.batches_retrieval_limit", 5, 5, C3864n0.f41453a, false);
        Long lValueOf2 = Long.valueOf(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
        f41145C = a("measurement.sgtm.upload.min_delay_after_startup", lValueOf2, lValueOf2, C3871o0.f41470a, false);
        f41147D = a("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, 1000L, C3878p0.f41488a, false);
        f41149E = a("measurement.sgtm.upload.min_delay_after_background", lValueOf, lValueOf, C3885q0.f41506a, false);
        f41151F = a("measurement.sgtm.batch.long_queuing_threshold", 14400000L, 14400000L, C3891r0.f41568a, false);
        f41153G = a("measurement.upload.backoff_period", 43200000L, 43200000L, C3905t0.f41602a, false);
        f41155H = a("measurement.upload.window_interval", 3600000L, 3600000L, C3912u0.f41643a, false);
        f41157I = a("measurement.upload.interval", 3600000L, 3600000L, C3919v0.f41660a, false);
        f41159J = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C3926w0.f41677a, false);
        f41161K = a("measurement.upload.debug_upload_interval", 1000L, 1000L, C3933x0.f41741a, false);
        f41163L = a("measurement.upload.minimum_delay", 500L, 500L, C3940y0.f41784a, false);
        f41165M = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C3947z0.f41801a, false);
        f41167N = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, A0.f40605a, false);
        f41169O = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, B0.f40631a, false);
        f41171P = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, D0.f40698a, false);
        f41173Q = a("measurement.upload.retry_time", 1800000L, 1800000L, F0.f40750a, false);
        f41175R = a("measurement.upload.retry_count", 6, 6, G0.f40768a, false);
        f41177S = a("measurement.upload.max_queue_time", 518400000L, 518400000L, H0.f40786a, false);
        f41179T = a("measurement.upload.google_signal_max_queue_time", 300000L, 300000L, I0.f40796a, false);
        f41181U = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, J0.f40813a, false);
        f41183V = a("measurement.audience.filter_result_max_count", 200, 200, K0.f40826a, false);
        f41185W = a("measurement.upload.max_public_user_properties", 100, 100, null, false);
        f41187X = a("measurement.upload.max_event_name_cardinality", 2000, 2000, null, false);
        f41189Y = a("measurement.upload.max_public_event_params", 100, 100, null, false);
        f41191Z = a("measurement.service_client.idle_disconnect_millis", lValueOf2, lValueOf2, L0.f40839a, false);
        f41194a0 = a("measurement.service_client.reconnect_millis", 1000L, 1000L, M0.f40850a, false);
        Boolean bool = Boolean.FALSE;
        f41197b0 = a("measurement.test.boolean_flag", bool, bool, N0.f40866a, false);
        f41200c0 = a("measurement.test.string_flag", "---", "---", O0.f40883a, false);
        f41203d0 = a("measurement.test.long_flag", -1L, -1L, Q0.f40918a, false);
        a("measurement.test.cached_long_flag", -1L, -1L, R0.f40928a, true);
        f41206e0 = a("measurement.test.int_flag", -2, -2, S0.f40948a, false);
        Double dValueOf = Double.valueOf(-3.0d);
        f41209f0 = a("measurement.test.double_flag", dValueOf, dValueOf, T0.f40966a, false);
        f41212g0 = a("measurement.experiment.max_ids", 50, 50, U0.f40983a, false);
        f41215h0 = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, V0.f40992a, false);
        f41218i0 = a("measurement.upload.max_event_parameter_value_length", 500, 500, W0.f41004a, true);
        f41221j0 = a("measurement.max_bundles_per_iteration", 100, 100, X0.f41012a, false);
        f41224k0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, Y0.f41057a, false);
        f41227l0 = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, Z0.f41071a, false);
        f41230m0 = a("measurement.rb.attribution.client.min_ad_services_version", 7, 7, C3772b1.f41100a, false);
        f41232n0 = a("measurement.dma_consent.max_daily_dcu_realtime_events", 1, 1, C3780c1.f41118a, false);
        f41234o0 = a("measurement.rb.attribution.uri_scheme", Constants.SCHEME, Constants.SCHEME, C3796e1.f41271a, false);
        f41236p0 = a("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", C3804f1.f41285a, false);
        f41238q0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", C3812g1.f41305a, false);
        f41240r0 = a("measurement.session.engagement_interval", 3600000L, 3600000L, C3820h1.f41336a, false);
        f41242s0 = a("measurement.rb.attribution.app_allowlist", "", "", C3828i1.f41363a, false);
        f41244t0 = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", "_npa,npa|_fot,fot", C3836j1.f41378a, false);
        f41246u0 = a("measurement.rb.attribution.event_params", "value|currency", "value|currency", C3844k1.f41395a, false);
        f41248v0 = a("measurement.rb.attribution.query_parameters_to_remove", "", "", C3851l1.f41410a, false);
        f41250w0 = a("measurement.rb.attribution.max_queue_time", 864000000L, 864000000L, C3865n1.f41454a, false);
        f41252x0 = a("measurement.rb.attribution.max_retry_delay_seconds", 16, 16, C3872o1.f41471a, false);
        f41254y0 = a("measurement.rb.attribution.client.min_time_after_boot_seconds", 90, 90, C3879p1.f41489a, false);
        a("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, 0, C3886q1.f41507a, false);
        f41256z0 = a("measurement.rb.max_trigger_registrations_per_day", 1000, 1000, C3892r1.f41569a, false);
        Boolean bool2 = Boolean.TRUE;
        f41142A0 = a("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, bool2, C3899s1.f41584a, false);
        f41144B0 = a("measurement.config.notify_trigger_uris_on_backgrounded", bool2, bool2, C3906t1.f41603a, false);
        f41146C0 = a("measurement.rb.attribution.notify_app_delay_millis", 3000, 3000, C3913u1.f41644a, false);
        f41148D0 = a("measurement.quality.checksum", bool, bool, null, false);
        f41150E0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C3920v1.f41661a, false);
        f41152F0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C3927w1.f41678a, false);
        f41154G0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C3941y1.f41785a, true);
        f41156H0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C3948z1.f41802a, false);
        f41158I0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, A1.f40606a, false);
        f41160J0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, B1.f40632a, false);
        f41162K0 = a("measurement.service.storage_consent_support_version", 203600, 203600, C1.f40686a, false);
        f41164L0 = a("measurement.service.store_null_safelist", bool2, bool2, D1.f40699a, false);
        f41166M0 = a("measurement.service.store_safelist", bool2, bool2, F1.f40751a, false);
        f41168N0 = a("measurement.session_stitching_token_enabled", bool, bool, G1.f40769a, false);
        f41170O0 = a("measurement.sgtm.client.upload_on_backgrounded.dev", bool, bool, H1.f40787a, true);
        f41172P0 = a("measurement.gmscore_client_telemetry", bool, bool, Y1.f41058a, false);
        f41174Q0 = a("measurement.rb.attribution.service", bool2, bool2, I1.f40797a, true);
        f41176R0 = a("measurement.rb.attribution.client2", bool2, bool2, K1.f40827a, true);
        f41178S0 = a("measurement.rb.attribution.uuid_generation", bool2, bool2, L1.f40840a, false);
        f41180T0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, bool2, M1.f40851a, false);
        a("measurement.rb.attribution.followup1.service", bool, bool, N1.f40867a, false);
        f41182U0 = a("measurement.rb.attribution.retry_disposition", bool, bool, O1.f40884a, false);
        f41184V0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, C3773b2.f41101a, false);
        f41186W0 = a("measurement.set_default_event_parameters_propagate_clear.service.dev", bool2, bool2, P1.f40896a, false);
        f41188X0 = a("measurement.set_default_event_parameters_propagate_clear.client.dev", bool2, bool2, Q1.f40919a, false);
        f41190Y0 = a("measurement.service.ad_impression.convert_value_to_double", bool2, bool2, R1.f40929a, false);
        a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, bool2, S1.f40949a, false);
        a("measurement.remove_conflicting_first_party_apis.dev", bool, bool, T1.f40967a, false);
        f41192Z0 = a("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, bool2, P.f40894a, false);
        f41195a1 = a("measurement.tcf.consent_fix", bool2, bool2, Q.f40917a, false);
        f41198b1 = a("measurement.experiment.enable_phenotype_experiment_reporting", bool2, bool2, S.f40947a, false);
        f41201c1 = a("measurement.set_default_event_parameters.fix_service_request_ordering", bool, bool, J.f40812a, false);
        f41204d1 = a("measurement.set_default_event_parameters.fix_app_update_logging", bool2, bool2, I.f40795a, false);
        f41207e1 = a("measurement.service.fix_stop_bundling_bug", bool2, bool2, M.f40849a, false);
        f41210f1 = a("measurement.fix_params_logcat_spam", bool2, bool2, L.f40838a, false);
        f41213g1 = a("measurement.gbraid_campaign.stop_lgclid", bool, bool, X1.f41013a, false);
        f41216h1 = a("measurement.gbraid_compaign.compaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid", "gclid,gbraid,gad_campaignid", T.f40965a, false);
        f41219i1 = a("measurement.edpb.service", bool, bool, K.f40825a, false);
        f41222j1 = a("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp", "_f,_v,_cmp", U.f40982a, false);
        f41225k1 = a("measurement.add_first_launch_logging_timestamp.service", bool, bool, C3765a2.f41090a, false);
        f41228l1 = a("measurement.overlapping_bundles_fix", bool, bool, V.f40991a, false);
    }

    static C3781c2 a(String str, Object obj, Object obj2, N n10, boolean z10) {
        C3781c2 c3781c2 = new C3781c2(str, obj, obj2, n10, null);
        if (z10) {
            f41193a.add(c3781c2);
        }
        return c3781c2;
    }
}
