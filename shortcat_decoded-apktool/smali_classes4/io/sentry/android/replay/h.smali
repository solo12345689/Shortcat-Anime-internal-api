.class public final synthetic Lio/sentry/android/replay/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field public final synthetic a:Lio/sentry/android/replay/i;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/replay/h;->a:Lio/sentry/android/replay/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/h;->a:Lio/sentry/android/replay/i;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lio/sentry/android/replay/i$a;->a(Lio/sentry/android/replay/i;Ljava/io/File;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
