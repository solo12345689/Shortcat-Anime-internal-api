.class public final synthetic Lcom/facebook/react/devsupport/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/facebook/react/devsupport/m;


# direct methods
.method public synthetic constructor <init>(ZLcom/facebook/react/devsupport/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/l;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/l;->b:Lcom/facebook/react/devsupport/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/l;->a:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/l;->b:Lcom/facebook/react/devsupport/m;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/m;->a(ZLcom/facebook/react/devsupport/m;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
