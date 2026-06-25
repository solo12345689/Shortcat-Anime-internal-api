.class public abstract LP9/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP9/m$b;
    }
.end annotation


# static fields
.field private static final a:LP9/m;

.field private static final b:LP9/m;

.field private static final c:LP9/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP9/m$a;

    .line 2
    .line 3
    invoke-direct {v0}, LP9/m$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP9/m;->a:LP9/m;

    .line 7
    .line 8
    new-instance v0, LP9/m$b;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {v0, v1}, LP9/m$b;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LP9/m;->b:LP9/m;

    .line 15
    .line 16
    new-instance v0, LP9/m$b;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, LP9/m$b;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, LP9/m;->c:LP9/m;

    .line 23
    .line 24
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LP9/m$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/m;-><init>()V

    return-void
.end method

.method static synthetic a()LP9/m;
    .locals 1

    .line 1
    sget-object v0, LP9/m;->b:LP9/m;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic b()LP9/m;
    .locals 1

    .line 1
    sget-object v0, LP9/m;->c:LP9/m;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic c()LP9/m;
    .locals 1

    .line 1
    sget-object v0, LP9/m;->a:LP9/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public static j()LP9/m;
    .locals 1

    .line 1
    sget-object v0, LP9/m;->a:LP9/m;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public abstract d(II)LP9/m;
.end method

.method public abstract e(JJ)LP9/m;
.end method

.method public abstract f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)LP9/m;
.end method

.method public abstract g(ZZ)LP9/m;
.end method

.method public abstract h(ZZ)LP9/m;
.end method

.method public abstract i()I
.end method
