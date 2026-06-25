.class public final synthetic Lio/sentry/util/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/util/p$a;


# instance fields
.field public final synthetic a:Lio/sentry/util/s;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lio/sentry/z3;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/util/s;Ljava/lang/String;Lio/sentry/z3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/util/q;->a:Lio/sentry/util/s;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/util/q;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/util/q;->c:Lio/sentry/z3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/util/q;->a:Lio/sentry/util/s;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/util/q;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/util/q;->c:Lio/sentry/z3;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lio/sentry/util/s;->a(Lio/sentry/util/s;Ljava/lang/String;Lio/sentry/z3;)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
