.class final LE3/M4$h;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/M4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "h"
.end annotation


# instance fields
.field final synthetic a:LE3/M4;


# direct methods
.method private constructor <init>(LE3/M4;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/M4$h;->a:LE3/M4;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LE3/M4;LE3/M4$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LE3/M4$h;-><init>(LE3/M4;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "android.intent.action.MEDIA_BUTTON"

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p1, "android.intent.extra.KEY_EVENT"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/view/KeyEvent;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :cond_1
    iget-object p2, p0, LE3/M4$h;->a:LE3/M4;

    .line 26
    .line 27
    invoke-static {p2}, LE3/M4;->w0(LE3/M4;)LF3/n;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, LF3/n;->b()LF3/j;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2, p1}, LF3/j;->c(Landroid/view/KeyEvent;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method
