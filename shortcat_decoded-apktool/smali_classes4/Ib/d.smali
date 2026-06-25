.class public final LIb/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LIb/d;

.field private static final b:LS4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LIb/d;

    .line 2
    .line 3
    invoke-direct {v0}, LIb/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LIb/d;->a:LIb/d;

    .line 7
    .line 8
    const-string v0, "ExpoTintColor"

    .line 9
    .line 10
    invoke-static {v0}, LS4/g;->e(Ljava/lang/String;)LS4/g;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "memory(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LIb/d;->b:LS4/g;

    .line 20
    .line 21
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
.method public final a()LS4/g;
    .locals 1

    .line 1
    sget-object v0, LIb/d;->b:LS4/g;

    .line 2
    .line 3
    return-object v0
.end method
