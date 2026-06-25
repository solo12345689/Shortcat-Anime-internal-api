.class public final synthetic Lr4/B0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/common/util/concurrent/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lr4/B0;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lr4/B0;->b:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget v0, p0, Lr4/B0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lr4/B0;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lr4/E0;->g(ILjava/util/List;Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
