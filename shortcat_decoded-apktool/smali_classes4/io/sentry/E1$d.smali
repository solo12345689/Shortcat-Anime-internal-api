.class final Lio/sentry/E1$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/E1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# instance fields
.field private final a:Lio/sentry/O3;

.field private final b:Lio/sentry/O3;


# direct methods
.method public constructor <init>(Lio/sentry/O3;Lio/sentry/O3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/E1$d;->b:Lio/sentry/O3;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/E1$d;->a:Lio/sentry/O3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Lio/sentry/O3;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/E1$d;->b:Lio/sentry/O3;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lio/sentry/O3;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/E1$d;->a:Lio/sentry/O3;

    .line 2
    .line 3
    return-object v0
.end method
