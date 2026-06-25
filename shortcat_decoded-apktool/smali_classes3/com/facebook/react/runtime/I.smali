.class public final synthetic Lcom/facebook/react/runtime/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ly7/a;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Lcom/facebook/react/runtime/ReactHostImpl;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/runtime/I;->a:Lkotlin/jvm/functions/Function2;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/runtime/I;->b:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/runtime/I;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/facebook/react/runtime/I;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ly7/n;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/I;->a:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/runtime/I;->b:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/runtime/I;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/facebook/react/runtime/I;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->d(Lkotlin/jvm/functions/Function2;Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/String;Ly7/n;)Ly7/n;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
