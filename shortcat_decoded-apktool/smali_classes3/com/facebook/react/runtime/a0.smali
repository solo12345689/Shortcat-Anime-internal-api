.class public final synthetic Lcom/facebook/react/runtime/a0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ly7/a;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/runtime/a0;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/runtime/a0;->b:I

    .line 7
    .line 8
    iput p3, p0, Lcom/facebook/react/runtime/a0;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ly7/n;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/a0;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/runtime/a0;->b:I

    .line 4
    .line 5
    iget v2, p0, Lcom/facebook/react/runtime/a0;->c:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->o(Lcom/facebook/react/runtime/ReactHostImpl;IILy7/n;)Ly7/n;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
