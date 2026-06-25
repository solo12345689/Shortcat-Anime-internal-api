.class final LK0/g$a$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK0/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LK0/g$a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK0/g$a$f;

    .line 2
    .line 3
    invoke-direct {v0}, LK0/g$a$f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK0/g$a$f;->a:LK0/g$a$f;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a(LK0/g;LY/I;)V
    .locals 0

    .line 1
    invoke-interface {p1, p2}, LK0/g;->k(LY/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LK0/g;

    .line 2
    .line 3
    check-cast p2, LY/I;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LK0/g$a$f;->a(LK0/g;LY/I;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
