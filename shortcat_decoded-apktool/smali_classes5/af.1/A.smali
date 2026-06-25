.class public final Laf/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Laf/A;

.field private static final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Laf/A;

    .line 2
    .line 3
    invoke-direct {v0}, Laf/A;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Laf/A;->a:Laf/A;

    .line 7
    .line 8
    new-instance v0, LXe/c;

    .line 9
    .line 10
    const-string v1, "kotlin.internal.NoInfer"

    .line 11
    .line 12
    invoke-direct {v0, v1}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, LXe/c;

    .line 16
    .line 17
    const-string v2, "kotlin.internal.Exact"

    .line 18
    .line 19
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    filled-new-array {v0, v1}, [LXe/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, LUd/a0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Laf/A;->b:Ljava/util/Set;

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Laf/A;->b:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method
