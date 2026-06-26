with open(r"d:\Music\iTunes\Downloads\Shortcat Anime\com.flagcat.shortcat-apkleaks.txt", 'r') as f:
    lines = f.readlines()

print("=== APKELEAKS SEARCH ===")
for line in lines:
    if "profile" in line.lower() or "picture" in line.lower() or "avatar" in line.lower():
        print(line.strip())
