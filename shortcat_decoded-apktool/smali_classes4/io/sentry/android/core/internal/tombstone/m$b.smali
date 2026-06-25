.class abstract Lio/sentry/android/core/internal/tombstone/m$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/android/core/internal/tombstone/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Lxa/w;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lxa/e0$b;->o:Lxa/e0$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Lxa/e0$b;->m:Lxa/e0$b;

    .line 9
    .line 10
    invoke-static {}, Lio/sentry/android/core/internal/tombstone/l;->H()Lio/sentry/android/core/internal/tombstone/l;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {v0, v1, v2, v3}, Lxa/w;->b(Lxa/e0$b;Ljava/lang/Object;Lxa/e0$b;Ljava/lang/Object;)Lxa/w;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lio/sentry/android/core/internal/tombstone/m$b;->a:Lxa/w;

    .line 19
    .line 20
    return-void
.end method
