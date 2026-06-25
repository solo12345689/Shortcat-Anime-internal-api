.class final Lio/sentry/android/replay/screenshot/i$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/android/replay/screenshot/i;-><init>(Lio/sentry/android/replay/b;Lio/sentry/android/replay/r;Lio/sentry/z3;Lio/sentry/android/replay/s;Lio/sentry/android/replay/util/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/sentry/android/replay/screenshot/i;


# direct methods
.method constructor <init>(Lio/sentry/android/replay/screenshot/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/replay/screenshot/i$e;->a:Lio/sentry/android/replay/screenshot/i;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Canvas;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Canvas;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/replay/screenshot/i$e;->a:Lio/sentry/android/replay/screenshot/i;

    .line 4
    .line 5
    invoke-static {v1}, Lio/sentry/android/replay/screenshot/i;->m(Lio/sentry/android/replay/screenshot/i;)Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/screenshot/i$e;->a()Landroid/graphics/Canvas;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
