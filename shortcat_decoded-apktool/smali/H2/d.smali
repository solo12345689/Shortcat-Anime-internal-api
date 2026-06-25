.class public final synthetic LH2/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LH2/c$c;

.field public final synthetic b:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(LH2/c$c;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH2/d;->a:LH2/c$c;

    .line 5
    .line 6
    iput-object p2, p0, LH2/d;->b:Landroid/net/Uri;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LH2/d;->a:LH2/c$c;

    .line 2
    .line 3
    iget-object v1, p0, LH2/d;->b:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LH2/c$c;->a(LH2/c$c;Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
