.class public final synthetic Lio/sentry/android/core/f1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

.field public final synthetic b:Lio/sentry/a0;

.field public final synthetic c:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/a0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/f1;->a:Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/core/f1;->b:Lio/sentry/a0;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/android/core/f1;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/f1;->a:Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/core/f1;->b:Lio/sentry/a0;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/android/core/f1;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/a0;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
