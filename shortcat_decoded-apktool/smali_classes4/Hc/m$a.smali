.class public abstract LHc/m$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHc/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LHc/m;LUb/s;)LHc/n;
    .locals 0

    .line 1
    const-string p0, "registry"

    .line 2
    .line 3
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "NotificationsChannelsProvider"

    .line 7
    .line 8
    invoke-virtual {p1, p0}, LUb/s;->l(Ljava/lang/String;)Lgc/c;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string p1, "null cannot be cast to non-null type expo.modules.notifications.notifications.channels.NotificationsChannelsProvider"

    .line 13
    .line 14
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p0, LHc/n;

    .line 18
    .line 19
    return-object p0
.end method
