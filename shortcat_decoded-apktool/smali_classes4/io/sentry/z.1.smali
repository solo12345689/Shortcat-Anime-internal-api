.class public final synthetic Lio/sentry/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/util/l$a;


# instance fields
.field public final synthetic a:Lio/sentry/B;

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/B;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/z;->a:Lio/sentry/B;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/z;->b:Ljava/io/File;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/z;->a:Lio/sentry/B;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/z;->b:Ljava/io/File;

    .line 4
    .line 5
    check-cast p1, Lio/sentry/hints/l;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lio/sentry/B;->g(Lio/sentry/B;Ljava/io/File;Lio/sentry/hints/l;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
