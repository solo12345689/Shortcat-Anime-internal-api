.class public final enum Lcom/tencent/mmkv/a;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum a:Lcom/tencent/mmkv/a;

.field public static final enum b:Lcom/tencent/mmkv/a;

.field public static final enum c:Lcom/tencent/mmkv/a;

.field public static final enum d:Lcom/tencent/mmkv/a;

.field public static final enum e:Lcom/tencent/mmkv/a;

.field private static final synthetic f:[Lcom/tencent/mmkv/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/tencent/mmkv/a;

    .line 2
    .line 3
    const-string v1, "LevelDebug"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/tencent/mmkv/a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/tencent/mmkv/a;->a:Lcom/tencent/mmkv/a;

    .line 10
    .line 11
    new-instance v0, Lcom/tencent/mmkv/a;

    .line 12
    .line 13
    const-string v1, "LevelInfo"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/tencent/mmkv/a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/tencent/mmkv/a;->b:Lcom/tencent/mmkv/a;

    .line 20
    .line 21
    new-instance v0, Lcom/tencent/mmkv/a;

    .line 22
    .line 23
    const-string v1, "LevelWarning"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/tencent/mmkv/a;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/tencent/mmkv/a;->c:Lcom/tencent/mmkv/a;

    .line 30
    .line 31
    new-instance v0, Lcom/tencent/mmkv/a;

    .line 32
    .line 33
    const-string v1, "LevelError"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/tencent/mmkv/a;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/tencent/mmkv/a;->d:Lcom/tencent/mmkv/a;

    .line 40
    .line 41
    new-instance v0, Lcom/tencent/mmkv/a;

    .line 42
    .line 43
    const-string v1, "LevelNone"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/tencent/mmkv/a;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/tencent/mmkv/a;->e:Lcom/tencent/mmkv/a;

    .line 50
    .line 51
    invoke-static {}, Lcom/tencent/mmkv/a;->a()[Lcom/tencent/mmkv/a;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/tencent/mmkv/a;->f:[Lcom/tencent/mmkv/a;

    .line 56
    .line 57
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

.method private static synthetic a()[Lcom/tencent/mmkv/a;
    .locals 5

    .line 1
    sget-object v0, Lcom/tencent/mmkv/a;->a:Lcom/tencent/mmkv/a;

    .line 2
    .line 3
    sget-object v1, Lcom/tencent/mmkv/a;->b:Lcom/tencent/mmkv/a;

    .line 4
    .line 5
    sget-object v2, Lcom/tencent/mmkv/a;->c:Lcom/tencent/mmkv/a;

    .line 6
    .line 7
    sget-object v3, Lcom/tencent/mmkv/a;->d:Lcom/tencent/mmkv/a;

    .line 8
    .line 9
    sget-object v4, Lcom/tencent/mmkv/a;->e:Lcom/tencent/mmkv/a;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/tencent/mmkv/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/mmkv/a;
    .locals 1

    .line 1
    const-class v0, Lcom/tencent/mmkv/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/tencent/mmkv/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/tencent/mmkv/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/mmkv/a;->f:[Lcom/tencent/mmkv/a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/tencent/mmkv/a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/tencent/mmkv/a;

    .line 8
    .line 9
    return-object v0
.end method
