.class public Lio/sentry/android/core/M$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/android/core/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/io/File;

.field public final d:Ljava/util/Map;

.field public final e:Z


# direct methods
.method public constructor <init>(JJZLjava/io/File;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lio/sentry/android/core/M$b;->a:J

    .line 5
    .line 6
    iput-object p6, p0, Lio/sentry/android/core/M$b;->c:Ljava/io/File;

    .line 7
    .line 8
    iput-wide p3, p0, Lio/sentry/android/core/M$b;->b:J

    .line 9
    .line 10
    iput-object p7, p0, Lio/sentry/android/core/M$b;->d:Ljava/util/Map;

    .line 11
    .line 12
    iput-boolean p5, p0, Lio/sentry/android/core/M$b;->e:Z

    .line 13
    .line 14
    return-void
.end method
