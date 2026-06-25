.class public final Lio/sentry/D1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lio/sentry/i4;

.field private final b:Ljava/lang/Double;

.field private final c:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lio/sentry/i4;Lio/sentry/j;Ljava/lang/Double;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string p2, "transactionContexts is required"

    .line 5
    .line 6
    invoke-static {p1, p2}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lio/sentry/i4;

    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/D1;->a:Lio/sentry/i4;

    .line 13
    .line 14
    iput-object p3, p0, Lio/sentry/D1;->b:Ljava/lang/Double;

    .line 15
    .line 16
    if-nez p4, :cond_0

    .line 17
    .line 18
    sget-object p4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 19
    .line 20
    :cond_0
    iput-object p4, p0, Lio/sentry/D1;->c:Ljava/util/Map;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/D1;->b:Ljava/lang/Double;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lio/sentry/i4;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/D1;->a:Lio/sentry/i4;

    .line 2
    .line 3
    return-object v0
.end method
