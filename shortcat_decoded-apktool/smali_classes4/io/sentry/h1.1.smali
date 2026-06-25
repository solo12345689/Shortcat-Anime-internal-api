.class public final Lio/sentry/h1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/l0;


# static fields
.field private static final a:Lio/sentry/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/h1;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/h1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/h1;->a:Lio/sentry/h1;

    .line 7
    .line 8
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

.method public static b()Lio/sentry/h1;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/h1;->a:Lio/sentry/h1;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Lio/sentry/z3;Lio/sentry/B1;)Lio/sentry/transport/p;
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/transport/s;->a()Lio/sentry/transport/s;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
