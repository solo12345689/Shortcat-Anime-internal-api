.class final enum LXe/k;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum a:LXe/k;

.field public static final enum b:LXe/k;

.field public static final enum c:LXe/k;

.field private static final synthetic d:[LXe/k;

.field private static final synthetic e:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LXe/k;

    .line 2
    .line 3
    const-string v1, "BEGINNING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LXe/k;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LXe/k;->a:LXe/k;

    .line 10
    .line 11
    new-instance v0, LXe/k;

    .line 12
    .line 13
    const-string v1, "MIDDLE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LXe/k;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LXe/k;->b:LXe/k;

    .line 20
    .line 21
    new-instance v0, LXe/k;

    .line 22
    .line 23
    const-string v1, "AFTER_DOT"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LXe/k;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LXe/k;->c:LXe/k;

    .line 30
    .line 31
    invoke-static {}, LXe/k;->a()[LXe/k;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LXe/k;->d:[LXe/k;

    .line 36
    .line 37
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, LXe/k;->e:Lkotlin/enums/EnumEntries;

    .line 42
    .line 43
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final synthetic a()[LXe/k;
    .locals 3

    .line 1
    sget-object v0, LXe/k;->a:LXe/k;

    .line 2
    .line 3
    sget-object v1, LXe/k;->b:LXe/k;

    .line 4
    .line 5
    sget-object v2, LXe/k;->c:LXe/k;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [LXe/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LXe/k;
    .locals 1

    .line 1
    const-class v0, LXe/k;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LXe/k;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LXe/k;
    .locals 1

    .line 1
    sget-object v0, LXe/k;->d:[LXe/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LXe/k;

    .line 8
    .line 9
    return-object v0
.end method
