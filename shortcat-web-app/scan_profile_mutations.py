import re

bundle_path = r"d:\Music\iTunes\Downloads\Shortcat Anime\app-jadx\src\main\assets\index.android.bundle"

with open(bundle_path, 'rb') as f:
    content = f.read().decode('utf-8', errors='ignore')

# Let's search for "profile" in quotes, or "picture" in quotes, or search for "profile_picture"
print("=== SCAN FOR QUOTED ENDPOINTS ===")
matches = re.finditer(r'["\'](/api/v1/profile[^"\']*)["\']|["\'](profile_[^"\']*)["\']|["\'](profile/[^"\']*)["\']', content)
for m in matches:
    print(m.group(0))

print("\n=== SCAN FOR FETCH AND MUTATION CALLS ===")
# Find occurrences of "profile" inside functions or fetch configurations
matches_func = [m.start() for m in re.finditer(r'v1/profile', content)]
for idx in matches_func:
    print(content[idx-100:idx+250])
    print("-" * 80)
