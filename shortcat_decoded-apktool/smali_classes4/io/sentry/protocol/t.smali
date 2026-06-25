.class public final synthetic Lio/sentry/protocol/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/util/p$a;


# instance fields
.field public final synthetic a:Lio/sentry/protocol/x;

.field public final synthetic b:Ljava/util/UUID;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/protocol/x;Ljava/util/UUID;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/protocol/t;->a:Lio/sentry/protocol/x;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/protocol/t;->b:Ljava/util/UUID;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/protocol/t;->a:Lio/sentry/protocol/x;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/protocol/t;->b:Ljava/util/UUID;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lio/sentry/protocol/x;->a(Lio/sentry/protocol/x;Ljava/util/UUID;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
