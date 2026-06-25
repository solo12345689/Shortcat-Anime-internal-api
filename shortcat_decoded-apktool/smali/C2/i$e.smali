.class final LC2/i$e;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic a:LC2/i;


# direct methods
.method private constructor <init>(LC2/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC2/i$e;->a:LC2/i;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LC2/i;LC2/i$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LC2/i$e;-><init>(LC2/i;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LC2/i$e;->a:LC2/i;

    .line 8
    .line 9
    invoke-static {v0}, LC2/i;->a(LC2/i;)Lq2/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LC2/i$e;->a:LC2/i;

    .line 14
    .line 15
    invoke-static {v2}, LC2/i;->b(LC2/i;)LC2/j;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p1, p2, v1, v2}, LC2/e;->e(Landroid/content/Context;Landroid/content/Intent;Lq2/c;LC2/j;)LC2/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v0, p1}, LC2/i;->d(LC2/i;LC2/e;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method
