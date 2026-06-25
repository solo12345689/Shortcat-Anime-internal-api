.class public final synthetic Lio/sentry/react/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/z3$c;


# instance fields
.field public final synthetic a:Lio/sentry/react/n;

.field public final synthetic b:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/react/n;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/react/d;->a:Lio/sentry/react/n;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/react/d;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/react/d;->a:Lio/sentry/react/n;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/react/d;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lio/sentry/react/n;->b(Lio/sentry/react/n;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/V2;Lio/sentry/H;)Lio/sentry/V2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
