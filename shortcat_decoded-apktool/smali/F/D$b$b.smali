.class final LF/D$b$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/D$b;->a(Lh0/p;)Lh0/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh0/p;


# direct methods
.method constructor <init>(Lh0/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/D$b$b;->a:Lh0/p;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)LF/D;
    .locals 2

    .line 1
    new-instance v0, LF/D;

    .line 2
    .line 3
    iget-object v1, p0, LF/D$b$b;->a:Lh0/p;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LF/D;-><init>(Lh0/p;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LF/D$b$b;->a(Ljava/util/Map;)LF/D;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
