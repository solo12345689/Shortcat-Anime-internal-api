.class final LR0/G$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR0/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LR0/G$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR0/G$a;

    .line 2
    .line 3
    invoke-direct {v0}, LR0/G$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR0/G$a;->a:LR0/G$a;

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
.method public final a(LR0/s;LR0/s;)Ljava/lang/Integer;
    .locals 3

    .line 1
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, LR0/x;->a:LR0/x;

    .line 6
    .line 7
    invoke-virtual {v0}, LR0/x;->N()LR0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, LR0/G$a$a;->a:LR0/G$a$a;

    .line 12
    .line 13
    invoke-virtual {p1, v1, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->p(LR0/B;Lie/a;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p2}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {v0}, LR0/x;->N()LR0/B;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, LR0/G$a$b;->a:LR0/G$a$b;

    .line 32
    .line 33
    invoke-virtual {p2, v0, v1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->p(LR0/B;Lie/a;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LR0/s;

    .line 2
    .line 3
    check-cast p2, LR0/s;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LR0/G$a;->a(LR0/s;LR0/s;)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
