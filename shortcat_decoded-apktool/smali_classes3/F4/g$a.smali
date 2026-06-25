.class public final LF4/g$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF4/g;-><init>(Landroid/net/ConnectivityManager;LF4/e$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LF4/g;


# direct methods
.method constructor <init>(LF4/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF4/g$a;->a:LF4/g;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF4/g$a;->a:LF4/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p1, v1}, LF4/g;->b(LF4/g;Landroid/net/Network;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF4/g$a;->a:LF4/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, v1}, LF4/g;->b(LF4/g;Landroid/net/Network;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
