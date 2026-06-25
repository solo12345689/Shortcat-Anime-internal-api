.class final LF/o$a$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/o$a$a;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/o$a;


# direct methods
.method constructor <init>(LF/o$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/o$a$a$a;->a:LF/o$a;

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
.method public final invoke(LY/Y;)LY/X;
    .locals 1

    .line 2
    iget-object p1, p0, LF/o$a$a$a;->a:LF/o$a;

    .line 3
    new-instance v0, LF/o$a$a$a$a;

    invoke-direct {v0, p1}, LF/o$a$a$a$a;-><init>(LF/o$a;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, LF/o$a$a$a;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
