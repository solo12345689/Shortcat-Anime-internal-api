import re

bundle_path = r"d:\Music\iTunes\Downloads\Shortcat Anime\app-jadx\src\main\assets\index.android.bundle"

with open(bundle_path, 'rb') as f:
    content = f.read().decode('utf-8', errors='ignore')

# Match any endpoint string pattern starting with /api/v1/
matches = re.findall(r'\/api\/v1\/[a-zA-Z0-9_\-\/]+', content)
print("=== API V1 ENDPOINTS ===")
for m in sorted(list(set(matches))):
    print(m)
