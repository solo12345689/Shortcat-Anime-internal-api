.class public final enum LRb/d;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum b:LRb/d;

.field public static final enum c:LRb/d;

.field public static final enum d:LRb/d;

.field private static final synthetic e:[LRb/d;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LRb/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "granted"

    .line 5
    .line 6
    const-string v3, "GRANTED"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LRb/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LRb/d;->b:LRb/d;

    .line 12
    .line 13
    new-instance v0, LRb/d;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "undetermined"

    .line 17
    .line 18
    const-string v3, "UNDETERMINED"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, LRb/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LRb/d;->c:LRb/d;

    .line 24
    .line 25
    new-instance v0, LRb/d;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "denied"

    .line 29
    .line 30
    const-string v3, "DENIED"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, LRb/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LRb/d;->d:LRb/d;

    .line 36
    .line 37
    invoke-static {}, LRb/d;->a()[LRb/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, LRb/d;->e:[LRb/d;

    .line 42
    .line 43
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LRb/d;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static synthetic a()[LRb/d;
    .locals 3

    .line 1
    sget-object v0, LRb/d;->b:LRb/d;

    .line 2
    .line 3
    sget-object v1, LRb/d;->c:LRb/d;

    .line 4
    .line 5
    sget-object v2, LRb/d;->d:LRb/d;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [LRb/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LRb/d;
    .locals 1

    .line 1
    const-class v0, LRb/d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LRb/d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LRb/d;
    .locals 1

    .line 1
    sget-object v0, LRb/d;->e:[LRb/d;

    .line 2
    .line 3
    invoke-virtual {v0}, [LRb/d;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LRb/d;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LRb/d;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
