.class Lio/sentry/util/B$b;
.super Ljava/lang/ThreadLocal;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/util/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/util/B$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lio/sentry/util/B$b;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Lio/sentry/util/z;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/util/z;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/util/z;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/util/B$b;->a()Lio/sentry/util/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
