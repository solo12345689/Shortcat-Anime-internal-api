import re

bundle_path = r"d:\Music\iTunes\Downloads\Shortcat Anime\app-jadx\src\main\assets\index.android.bundle"

with open(bundle_path, 'rb') as f:
    content = f.read().decode('utf-8', errors='ignore')

# Find all occurrences of strings like /api/v1/profile/... or containing profile
matches = re.findall(r'v1/profile/[a-zA-Z_]+|v1/profile_[a-zA-Z_]+|profile/[a-zA-Z_]+', content)
print("=== Matches ===")
for m in sorted(list(set(matches))):
    print(m)
