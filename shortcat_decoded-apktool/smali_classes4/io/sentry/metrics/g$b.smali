.class Lio/sentry/metrics/g$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/metrics/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lio/sentry/metrics/g;


# direct methods
.method private constructor <init>(Lio/sentry/metrics/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/metrics/g$b;->a:Lio/sentry/metrics/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/metrics/g;Lio/sentry/metrics/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lio/sentry/metrics/g$b;-><init>(Lio/sentry/metrics/g;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/metrics/g$b;->a:Lio/sentry/metrics/g;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/metrics/g;->f(Lio/sentry/metrics/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
