.class public final synthetic Lcom/facebook/react/devsupport/T;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:[Lc7/e;

.field public final synthetic b:Lcom/facebook/react/devsupport/Y;


# direct methods
.method public synthetic constructor <init>([Lc7/e;Lcom/facebook/react/devsupport/Y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/T;->a:[Lc7/e;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/T;->b:Lcom/facebook/react/devsupport/Y;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/T;->a:[Lc7/e;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/T;->b:Lcom/facebook/react/devsupport/Y;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/react/devsupport/Y;->Z([Lc7/e;Lcom/facebook/react/devsupport/Y;Landroid/content/DialogInterface;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
