.class public final synthetic Lnb/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;


# instance fields
.field public final synthetic a:Lnb/l;

.field public final synthetic b:Lnb/l$a;


# direct methods
.method public synthetic constructor <init>(Lnb/l;Lnb/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnb/k;->a:Lnb/l;

    .line 5
    .line 6
    iput-object p2, p0, Lnb/k;->b:Lnb/l$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onPrimaryClipChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Lnb/k;->a:Lnb/l;

    .line 2
    .line 3
    iget-object v1, p0, Lnb/k;->b:Lnb/l$a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lnb/l$a;->a(Lnb/l;Lnb/l$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
