.class public final Lh0/m$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh0/m;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh0/m;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lh0/u;


# direct methods
.method public constructor <init>(Lh0/m;Ljava/lang/Object;Lh0/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh0/m$b;->a:Lh0/m;

    .line 2
    .line 3
    iput-object p2, p0, Lh0/m$b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lh0/m$b;->c:Lh0/u;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 4

    .line 1
    iget-object v0, p0, Lh0/m$b;->a:Lh0/m;

    .line 2
    .line 3
    invoke-static {v0}, Lh0/m;->l(Lh0/m;)Lt/P;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lh0/m$b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lt/P;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lh0/m$b;->c:Lh0/u;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lh0/m$b;->a:Lh0/m;

    .line 18
    .line 19
    invoke-static {v0}, Lh0/m;->m(Lh0/m;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lh0/m$b;->b:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, Lh0/m;->o(Lh0/m;Lh0/p;Ljava/util/Map;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
