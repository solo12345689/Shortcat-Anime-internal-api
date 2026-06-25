.class public final synthetic Lh0/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lh0/m;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lh0/u;


# direct methods
.method public synthetic constructor <init>(Lh0/m;Ljava/lang/Object;Lh0/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh0/i;->a:Lh0/m;

    .line 5
    .line 6
    iput-object p2, p0, Lh0/i;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lh0/i;->c:Lh0/u;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/i;->a:Lh0/m;

    .line 2
    .line 3
    iget-object v1, p0, Lh0/i;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lh0/i;->c:Lh0/u;

    .line 6
    .line 7
    check-cast p1, LY/Y;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, Lh0/m;->e(Lh0/m;Ljava/lang/Object;Lh0/u;LY/Y;)LY/X;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
