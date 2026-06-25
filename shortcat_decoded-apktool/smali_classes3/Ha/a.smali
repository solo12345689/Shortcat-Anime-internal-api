.class public final synthetic LHa/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:LEa/k;

.field public final synthetic b:Lcom/facebook/react/views/view/g;

.field public final synthetic c:LHa/b;


# direct methods
.method public synthetic constructor <init>(LEa/k;Lcom/facebook/react/views/view/g;LHa/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LHa/a;->a:LEa/k;

    .line 5
    .line 6
    iput-object p2, p0, LHa/a;->b:Lcom/facebook/react/views/view/g;

    .line 7
    .line 8
    iput-object p3, p0, LHa/a;->c:LHa/b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    iget-object v0, p0, LHa/a;->a:LEa/k;

    .line 2
    .line 3
    iget-object v1, p0, LHa/a;->b:Lcom/facebook/react/views/view/g;

    .line 4
    .line 5
    iget-object v2, p0, LHa/a;->c:LHa/b;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, LHa/b;->a(LEa/k;Lcom/facebook/react/views/view/g;LHa/b;Landroid/content/DialogInterface;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
