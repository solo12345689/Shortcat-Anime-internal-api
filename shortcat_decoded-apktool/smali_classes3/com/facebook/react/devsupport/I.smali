.class public final synthetic Lcom/facebook/react/devsupport/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/react/devsupport/Y;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:[Lc7/k;

.field public final synthetic d:I

.field public final synthetic e:Lc7/g;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/Y;Ljava/lang/String;[Lc7/k;ILc7/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/I;->a:Lcom/facebook/react/devsupport/Y;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/I;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/devsupport/I;->c:[Lc7/k;

    .line 9
    .line 10
    iput p4, p0, Lcom/facebook/react/devsupport/I;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Lcom/facebook/react/devsupport/I;->e:Lc7/g;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/I;->a:Lcom/facebook/react/devsupport/Y;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/I;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/devsupport/I;->c:[Lc7/k;

    .line 6
    .line 7
    iget v3, p0, Lcom/facebook/react/devsupport/I;->d:I

    .line 8
    .line 9
    iget-object v4, p0, Lcom/facebook/react/devsupport/I;->e:Lc7/g;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/react/devsupport/Y;->Q(Lcom/facebook/react/devsupport/Y;Ljava/lang/String;[Lc7/k;ILc7/g;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
