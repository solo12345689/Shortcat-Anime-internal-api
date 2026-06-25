.class final Ll1/o$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll1/o;-><init>(Ll1/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll1/o;


# direct methods
.method constructor <init>(Ll1/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/o$c;->a:Ll1/o;

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
.method public final a(LTd/L;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ll1/o$c;->a:Ll1/o;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, v0}, Ll1/o;->j(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LTd/L;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll1/o$c;->a(LTd/L;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
