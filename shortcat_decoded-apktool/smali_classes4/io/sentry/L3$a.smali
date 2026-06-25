.class Lio/sentry/L3$a;
.super Ljava/util/TimerTask;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/L3;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/sentry/L3;


# direct methods
.method constructor <init>(Lio/sentry/L3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/L3$a;->a:Lio/sentry/L3;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/L3$a;->a:Lio/sentry/L3;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/L3;->A(Lio/sentry/L3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
