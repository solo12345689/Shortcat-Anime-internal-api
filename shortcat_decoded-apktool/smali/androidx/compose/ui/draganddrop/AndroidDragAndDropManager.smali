.class public final Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Lo0/c;


# instance fields
.field private final a:Lie/o;

.field private final b:Lo0/d;

.field private final c:Lt/b;

.field private final d:Landroidx/compose/ui/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lie/o;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->a:Lie/o;

    .line 5
    .line 6
    new-instance p1, Lo0/d;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p1, v1, v1, v0, v1}, Lo0/d;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->b:Lo0/d;

    .line 14
    .line 15
    new-instance p1, Lt/b;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {p1, v0, v2, v1}, Lt/b;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->c:Lt/b;

    .line 23
    .line 24
    new-instance p1, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;-><init>(Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->d:Landroidx/compose/ui/e;

    .line 30
    .line 31
    return-void
.end method

.method public static final synthetic c(Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;)Lo0/d;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->b:Lo0/d;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lo0/f;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->c:Lt/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/b;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Lo0/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->c:Lt/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/b;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()Landroidx/compose/ui/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->d:Landroidx/compose/ui/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 2

    .line 1
    new-instance p1, Lo0/b;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lo0/b;-><init>(Landroid/view/DragEvent;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const/4 v0, 0x0

    .line 11
    packed-switch p2, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_0
    iget-object p2, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->b:Lo0/d;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lo0/d;->c0(Lo0/b;)V

    .line 18
    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_1
    iget-object p2, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->b:Lo0/d;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Lo0/d;->X0(Lo0/b;)V

    .line 24
    .line 25
    .line 26
    return v0

    .line 27
    :pswitch_2
    iget-object p2, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->b:Lo0/d;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Lo0/d;->w0(Lo0/b;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->c:Lt/b;

    .line 33
    .line 34
    invoke-virtual {p1}, Lt/b;->clear()V

    .line 35
    .line 36
    .line 37
    return v0

    .line 38
    :pswitch_3
    iget-object p2, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->b:Lo0/d;

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Lo0/d;->Q0(Lo0/b;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :pswitch_4
    iget-object p2, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->b:Lo0/d;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Lo0/d;->v0(Lo0/b;)V

    .line 48
    .line 49
    .line 50
    return v0

    .line 51
    :pswitch_5
    iget-object p2, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->b:Lo0/d;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Lo0/d;->E1(Lo0/b;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    iget-object v0, p0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;->c:Lt/b;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Lo0/f;

    .line 74
    .line 75
    invoke-interface {v1, p1}, Lo0/f;->U(Lo0/b;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    return p2

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
