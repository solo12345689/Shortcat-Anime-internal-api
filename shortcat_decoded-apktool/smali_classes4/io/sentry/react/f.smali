.class public final synthetic Lio/sentry/react/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/g2$a;


# instance fields
.field public final synthetic a:Lio/sentry/react/n;

.field public final synthetic b:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/react/n;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/react/f;->a:Lio/sentry/react/n;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/react/f;->b:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/z3;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/react/f;->a:Lio/sentry/react/n;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/react/f;->b:Lcom/facebook/react/bridge/ReadableMap;

    .line 4
    .line 5
    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lio/sentry/react/n;->k(Lio/sentry/react/n;Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
