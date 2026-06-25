.class abstract Lxa/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxa/u$c;,
        Lxa/u$b;
    }
.end annotation


# static fields
.field private static final a:Lxa/u;

.field private static final b:Lxa/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxa/u$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxa/u$b;-><init>(Lxa/u$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxa/u;->a:Lxa/u;

    .line 8
    .line 9
    new-instance v0, Lxa/u$c;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lxa/u$c;-><init>(Lxa/u$a;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lxa/u;->b:Lxa/u;

    .line 15
    .line 16
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lxa/u$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxa/u;-><init>()V

    return-void
.end method

.method static a()Lxa/u;
    .locals 1

    .line 1
    sget-object v0, Lxa/u;->a:Lxa/u;

    .line 2
    .line 3
    return-object v0
.end method

.method static b()Lxa/u;
    .locals 1

    .line 1
    sget-object v0, Lxa/u;->b:Lxa/u;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method abstract c(Ljava/lang/Object;J)V
.end method

.method abstract d(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method

.method abstract e(Ljava/lang/Object;J)Ljava/util/List;
.end method
