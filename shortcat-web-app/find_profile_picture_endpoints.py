import re

bundle_path = r"d:\Music\iTunes\Downloads\Shortcat Anime\app-jadx\src\main\assets\index.android.bundle"

with open(bundle_path, 'rb') as f:
    content = f.read().decode('utf-8', errors='ignore')

# Search for any string ending in api/v1/profile... or containing profile
matches = re.findall(r'["\'][^"\']*api/v1/[^"\']*["\']', content)
print("=== API ENDPOINTS ===")
for m in set(matches):
    if "profile" in m or "picture" in m or "avatar" in m:
        print(m)
