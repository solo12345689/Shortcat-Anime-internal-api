.class public final LU/N;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LU/N;

.field private static final b:LT/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LU/N;

    .line 2
    .line 3
    invoke-direct {v0}, LU/N;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU/N;->a:LU/N;

    .line 7
    .line 8
    new-instance v0, LT/d;

    .line 9
    .line 10
    const v1, 0x3dcccccd    # 0.1f

    .line 11
    .line 12
    .line 13
    const v2, 0x3da3d70a    # 0.08f

    .line 14
    .line 15
    .line 16
    const v3, 0x3e23d70a    # 0.16f

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v3, v1, v2, v1}, LT/d;-><init>(FFFF)V

    .line 20
    .line 21
    .line 22
    sput-object v0, LU/N;->b:LT/d;

    .line 23
    .line 24
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
.method public final a()LT/d;
    .locals 1

    .line 1
    sget-object v0, LU/N;->b:LT/d;

    .line 2
    .line 3
    return-object v0
.end method
