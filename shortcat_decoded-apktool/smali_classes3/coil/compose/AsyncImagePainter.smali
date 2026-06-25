.class public final Lcoil/compose/AsyncImagePainter;
.super Lw0/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/v1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil/compose/AsyncImagePainter$b;,
        Lcoil/compose/AsyncImagePainter$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0007\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0003\'\u0080\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0001*\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\t*\u00020\u001dH\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0014\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010\'\u001a\u00020\"2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u0014\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008)\u0010\u000bJ\u000f\u0010*\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008*\u0010\u000bJ\u000f\u0010+\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008+\u0010\u000bR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u001d\u00104\u001a\u0008\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u00082\u00103R/\u0010<\u001a\u0004\u0018\u00010\u00012\u0008\u00105\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R+\u0010!\u001a\u00020 2\u0006\u00105\u001a\u00020 8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008=\u00107\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR/\u0010&\u001a\u0004\u0018\u00010%2\u0008\u00105\u001a\u0004\u0018\u00010%8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008B\u00107\u001a\u0004\u0008C\u0010D\"\u0004\u0008E\u0010FR$\u0010K\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e8\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008H\u0010I\"\u0004\u0008J\u0010\u0011R(\u0010N\u001a\u0004\u0018\u00010\u00012\u0008\u0010G\u001a\u0004\u0018\u00010\u00018\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010L\"\u0004\u0008M\u0010;R.\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0O8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010S\"\u0004\u0008T\u0010UR0\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010O8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008W\u0010Q\u001a\u0004\u0008X\u0010S\"\u0004\u0008Y\u0010UR\"\u0010b\u001a\u00020[8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010]\u001a\u0004\u0008^\u0010_\"\u0004\u0008`\u0010aR+\u0010j\u001a\u00020c8\u0000@\u0000X\u0080\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u0008d\u0010e\u001a\u0004\u0008f\u0010g\"\u0004\u0008h\u0010iR\"\u0010q\u001a\u00020\"8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008k\u0010l\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR+\u0010v\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008r\u00107\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010\u0011R+\u0010\u0004\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00038F@@X\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\n\u00107\u001a\u0004\u0008w\u0010x\"\u0004\u0008e\u0010yR+\u0010\u0006\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00058F@@X\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008>\u00107\u001a\u0004\u0008z\u0010{\"\u0004\u0008|\u0010}R\u001d\u0010\u007f\u001a\u0002018VX\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010~\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0081\u0001"
    }
    d2 = {
        "Lcoil/compose/AsyncImagePainter;",
        "Lw0/b;",
        "LY/v1;",
        "LG4/h;",
        "request",
        "Lv4/d;",
        "imageLoader",
        "<init>",
        "(LG4/h;Lv4/d;)V",
        "LTd/L;",
        "t",
        "()V",
        "P",
        "(LG4/h;)LG4/h;",
        "Lcoil/compose/AsyncImagePainter$State;",
        "input",
        "Q",
        "(Lcoil/compose/AsyncImagePainter$State;)V",
        "previous",
        "current",
        "Lcoil/compose/CrossfadePainter;",
        "z",
        "(Lcoil/compose/AsyncImagePainter$State;Lcoil/compose/AsyncImagePainter$State;)Lcoil/compose/CrossfadePainter;",
        "LG4/i;",
        "O",
        "(LG4/i;)Lcoil/compose/AsyncImagePainter$State;",
        "Landroid/graphics/drawable/Drawable;",
        "N",
        "(Landroid/graphics/drawable/Drawable;)Lw0/b;",
        "Lu0/f;",
        "m",
        "(Lu0/f;)V",
        "",
        "alpha",
        "",
        "a",
        "(F)Z",
        "Landroidx/compose/ui/graphics/d;",
        "colorFilter",
        "b",
        "(Landroidx/compose/ui/graphics/d;)Z",
        "c",
        "e",
        "d",
        "LGf/O;",
        "g",
        "LGf/O;",
        "rememberScope",
        "LJf/u;",
        "Lr0/l;",
        "h",
        "LJf/u;",
        "drawSize",
        "<set-?>",
        "i",
        "LY/C0;",
        "x",
        "()Lw0/b;",
        "G",
        "(Lw0/b;)V",
        "painter",
        "j",
        "u",
        "()F",
        "A",
        "(F)V",
        "k",
        "v",
        "()Landroidx/compose/ui/graphics/d;",
        "B",
        "(Landroidx/compose/ui/graphics/d;)V",
        "value",
        "l",
        "Lcoil/compose/AsyncImagePainter$State;",
        "M",
        "_state",
        "Lw0/b;",
        "L",
        "_painter",
        "Lkotlin/Function1;",
        "n",
        "Lkotlin/jvm/functions/Function1;",
        "getTransform$coil_compose_base_release",
        "()Lkotlin/jvm/functions/Function1;",
        "K",
        "(Lkotlin/jvm/functions/Function1;)V",
        "transform",
        "o",
        "getOnState$coil_compose_base_release",
        "F",
        "onState",
        "LI0/f;",
        "p",
        "LI0/f;",
        "getContentScale$coil_compose_base_release",
        "()LI0/f;",
        "C",
        "(LI0/f;)V",
        "contentScale",
        "Ls0/X0;",
        "q",
        "I",
        "getFilterQuality-f-v9h1I$coil_compose_base_release",
        "()I",
        "D",
        "(I)V",
        "filterQuality",
        "r",
        "Z",
        "isPreview$coil_compose_base_release",
        "()Z",
        "H",
        "(Z)V",
        "isPreview",
        "s",
        "getState",
        "()Lcoil/compose/AsyncImagePainter$State;",
        "J",
        "state",
        "y",
        "()LG4/h;",
        "(LG4/h;)V",
        "w",
        "()Lv4/d;",
        "E",
        "(Lv4/d;)V",
        "()J",
        "intrinsicSize",
        "State",
        "coil-compose-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final v:Lcoil/compose/AsyncImagePainter$b;

.field private static final w:Lkotlin/jvm/functions/Function1;


# instance fields
.field private g:LGf/O;

.field private final h:LJf/u;

.field private final i:LY/C0;

.field private final j:LY/C0;

.field private final k:LY/C0;

.field private l:Lcoil/compose/AsyncImagePainter$State;

.field private m:Lw0/b;

.field private n:Lkotlin/jvm/functions/Function1;

.field private o:Lkotlin/jvm/functions/Function1;

.field private p:LI0/f;

.field private q:I

.field private r:Z

.field private final s:LY/C0;

.field private final t:LY/C0;

.field private final u:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcoil/compose/AsyncImagePainter$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcoil/compose/AsyncImagePainter$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcoil/compose/AsyncImagePainter;->v:Lcoil/compose/AsyncImagePainter$b;

    .line 8
    .line 9
    sget-object v0, Lcoil/compose/AsyncImagePainter$a;->a:Lcoil/compose/AsyncImagePainter$a;

    .line 10
    .line 11
    sput-object v0, Lcoil/compose/AsyncImagePainter;->w:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(LG4/h;Lv4/d;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lw0/b;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lr0/l;->b:Lr0/l$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lr0/l$a;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lr0/l;->c(J)Lr0/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, LJf/K;->a(Ljava/lang/Object;)LJf/u;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcoil/compose/AsyncImagePainter;->h:LJf/u;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-static {v0, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, p0, Lcoil/compose/AsyncImagePainter;->i:LY/C0;

    .line 27
    .line 28
    const/high16 v2, 0x3f800000    # 1.0f

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, p0, Lcoil/compose/AsyncImagePainter;->j:LY/C0;

    .line 39
    .line 40
    invoke-static {v0, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iput-object v2, p0, Lcoil/compose/AsyncImagePainter;->k:LY/C0;

    .line 45
    .line 46
    sget-object v2, Lcoil/compose/AsyncImagePainter$State$a;->a:Lcoil/compose/AsyncImagePainter$State$a;

    .line 47
    .line 48
    iput-object v2, p0, Lcoil/compose/AsyncImagePainter;->l:Lcoil/compose/AsyncImagePainter$State;

    .line 49
    .line 50
    sget-object v3, Lcoil/compose/AsyncImagePainter;->w:Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    iput-object v3, p0, Lcoil/compose/AsyncImagePainter;->n:Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    sget-object v3, LI0/f;->a:LI0/f$a;

    .line 55
    .line 56
    invoke-virtual {v3}, LI0/f$a;->b()LI0/f;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iput-object v3, p0, Lcoil/compose/AsyncImagePainter;->p:LI0/f;

    .line 61
    .line 62
    sget-object v3, Lu0/f;->j0:Lu0/f$a;

    .line 63
    .line 64
    invoke-virtual {v3}, Lu0/f$a;->b()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    iput v3, p0, Lcoil/compose/AsyncImagePainter;->q:I

    .line 69
    .line 70
    invoke-static {v2, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object v2, p0, Lcoil/compose/AsyncImagePainter;->s:LY/C0;

    .line 75
    .line 76
    invoke-static {p1, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->t:LY/C0;

    .line 81
    .line 82
    invoke-static {p2, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->u:LY/C0;

    .line 87
    .line 88
    return-void
.end method

.method private final A(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->j:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final B(Landroidx/compose/ui/graphics/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->k:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final G(Lw0/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->i:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final J(Lcoil/compose/AsyncImagePainter$State;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->s:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final L(Lw0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->m:Lw0/b;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcoil/compose/AsyncImagePainter;->G(Lw0/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final M(Lcoil/compose/AsyncImagePainter$State;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->l:Lcoil/compose/AsyncImagePainter$State;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcoil/compose/AsyncImagePainter;->J(Lcoil/compose/AsyncImagePainter$State;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final N(Landroid/graphics/drawable/Drawable;)Lw0/b;
    .locals 8

    .line 1
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ls0/O;->c(Landroid/graphics/Bitmap;)Ls0/b1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v5, p0, Lcoil/compose/AsyncImagePainter;->q:I

    .line 16
    .line 17
    const/4 v6, 0x6

    .line 18
    const/4 v7, 0x0

    .line 19
    const-wide/16 v1, 0x0

    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    invoke-static/range {v0 .. v7}, Lw0/a;->b(Ls0/b1;JJIILjava/lang/Object;)Landroidx/compose/ui/graphics/painter/BitmapPainter;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    new-instance v0, Lcom/google/accompanist/drawablepainter/DrawablePainter;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Lcom/google/accompanist/drawablepainter/DrawablePainter;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method private final O(LG4/i;)Lcoil/compose/AsyncImagePainter$State;
    .locals 2

    .line 1
    instance-of v0, p1, LG4/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcoil/compose/AsyncImagePainter$State$Success;

    .line 6
    .line 7
    check-cast p1, LG4/q;

    .line 8
    .line 9
    invoke-virtual {p1}, LG4/q;->a()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, v1}, Lcoil/compose/AsyncImagePainter;->N(Landroid/graphics/drawable/Drawable;)Lw0/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1, p1}, Lcoil/compose/AsyncImagePainter$State$Success;-><init>(Lw0/b;LG4/q;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    instance-of v0, p1, LG4/f;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    new-instance v0, Lcoil/compose/AsyncImagePainter$State$Error;

    .line 26
    .line 27
    invoke-virtual {p1}, LG4/i;->a()Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, v1}, Lcoil/compose/AsyncImagePainter;->N(Landroid/graphics/drawable/Drawable;)Lw0/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    :goto_0
    check-cast p1, LG4/f;

    .line 40
    .line 41
    invoke-direct {v0, v1, p1}, Lcoil/compose/AsyncImagePainter$State$Error;-><init>(Lw0/b;LG4/f;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    new-instance p1, LTd/r;

    .line 46
    .line 47
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method private final P(LG4/h;)LG4/h;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p1, v0, v1, v0}, LG4/h;->R(LG4/h;Landroid/content/Context;ILjava/lang/Object;)LG4/h$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcoil/compose/AsyncImagePainter$d;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcoil/compose/AsyncImagePainter$d;-><init>(Lcoil/compose/AsyncImagePainter;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LG4/h$a;->o(LI4/a;)LG4/h$a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, LG4/d;->m()LH4/i;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    new-instance v1, Lcoil/compose/AsyncImagePainter$e;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Lcoil/compose/AsyncImagePainter$e;-><init>(Lcoil/compose/AsyncImagePainter;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, LG4/h$a;->n(LH4/i;)LG4/h$a;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, LG4/d;->l()LH4/g;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lcoil/compose/AsyncImagePainter;->p:LI0/f;

    .line 45
    .line 46
    invoke-static {v1}, Lcoil/compose/c;->g(LI0/f;)LH4/g;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, LG4/h$a;->m(LH4/g;)LG4/h$a;

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, LG4/d;->k()LH4/e;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget-object v1, LH4/e;->a:LH4/e;

    .line 62
    .line 63
    if-eq p1, v1, :cond_2

    .line 64
    .line 65
    sget-object p1, LH4/e;->b:LH4/e;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, LG4/h$a;->g(LH4/e;)LG4/h$a;

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-virtual {v0}, LG4/h$a;->a()LG4/h;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method

.method private final Q(Lcoil/compose/AsyncImagePainter$State;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->l:Lcoil/compose/AsyncImagePainter$State;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil/compose/AsyncImagePainter;->n:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcoil/compose/AsyncImagePainter$State;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcoil/compose/AsyncImagePainter;->M(Lcoil/compose/AsyncImagePainter$State;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0, p1}, Lcoil/compose/AsyncImagePainter;->z(Lcoil/compose/AsyncImagePainter$State;Lcoil/compose/AsyncImagePainter$State;)Lcoil/compose/CrossfadePainter;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p1}, Lcoil/compose/AsyncImagePainter$State;->a()Lw0/b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-direct {p0, v1}, Lcoil/compose/AsyncImagePainter;->L(Lw0/b;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcoil/compose/AsyncImagePainter;->g:LGf/O;

    .line 29
    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    invoke-virtual {v0}, Lcoil/compose/AsyncImagePainter$State;->a()Lw0/b;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lcoil/compose/AsyncImagePainter$State;->a()Lw0/b;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eq v1, v2, :cond_4

    .line 41
    .line 42
    invoke-virtual {v0}, Lcoil/compose/AsyncImagePainter$State;->a()Lw0/b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    instance-of v1, v0, LY/v1;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    check-cast v0, LY/v1;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v0, v2

    .line 55
    :goto_1
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-interface {v0}, LY/v1;->e()V

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-virtual {p1}, Lcoil/compose/AsyncImagePainter$State;->a()Lw0/b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    instance-of v1, v0, LY/v1;

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    move-object v2, v0

    .line 69
    check-cast v2, LY/v1;

    .line 70
    .line 71
    :cond_3
    if-eqz v2, :cond_4

    .line 72
    .line 73
    invoke-interface {v2}, LY/v1;->c()V

    .line 74
    .line 75
    .line 76
    :cond_4
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->o:Lkotlin/jvm/functions/Function1;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    :cond_5
    return-void
.end method

.method public static final synthetic n()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, Lcoil/compose/AsyncImagePainter;->w:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic o(Lcoil/compose/AsyncImagePainter;)LJf/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lcoil/compose/AsyncImagePainter;->h:LJf/u;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcoil/compose/AsyncImagePainter;Landroid/graphics/drawable/Drawable;)Lw0/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcoil/compose/AsyncImagePainter;->N(Landroid/graphics/drawable/Drawable;)Lw0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic q(Lcoil/compose/AsyncImagePainter;LG4/i;)Lcoil/compose/AsyncImagePainter$State;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcoil/compose/AsyncImagePainter;->O(LG4/i;)Lcoil/compose/AsyncImagePainter$State;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r(Lcoil/compose/AsyncImagePainter;LG4/h;)LG4/h;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcoil/compose/AsyncImagePainter;->P(LG4/h;)LG4/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic s(Lcoil/compose/AsyncImagePainter;Lcoil/compose/AsyncImagePainter$State;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcoil/compose/AsyncImagePainter;->Q(Lcoil/compose/AsyncImagePainter$State;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final t()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->g:LGf/O;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, LGf/P;->d(LGf/O;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v1, p0, Lcoil/compose/AsyncImagePainter;->g:LGf/O;

    .line 11
    .line 12
    return-void
.end method

.method private final u()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->j:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private final v()Landroidx/compose/ui/graphics/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->k:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/graphics/d;

    .line 8
    .line 9
    return-object v0
.end method

.method private final x()Lw0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->i:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lw0/b;

    .line 8
    .line 9
    return-object v0
.end method

.method private final z(Lcoil/compose/AsyncImagePainter$State;Lcoil/compose/AsyncImagePainter$State;)Lcoil/compose/CrossfadePainter;
    .locals 11

    .line 1
    instance-of v0, p2, Lcoil/compose/AsyncImagePainter$State$Success;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p2

    .line 7
    check-cast v0, Lcoil/compose/AsyncImagePainter$State$Success;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcoil/compose/AsyncImagePainter$State$Success;->b()LG4/q;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    instance-of v0, p2, Lcoil/compose/AsyncImagePainter$State$Error;

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, Lcoil/compose/AsyncImagePainter$State$Error;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcoil/compose/AsyncImagePainter$State$Error;->d()LG4/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-virtual {v0}, LG4/i;->b()LG4/h;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, LG4/h;->P()LK4/c$a;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {}, Lcoil/compose/b;->a()Lcoil/compose/b$a;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v2, v3, v0}, LK4/c$a;->a(LK4/d;LG4/i;)LK4/c;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    instance-of v3, v2, LK4/a;

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    invoke-virtual {p1}, Lcoil/compose/AsyncImagePainter$State;->a()Lw0/b;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    instance-of p1, p1, Lcoil/compose/AsyncImagePainter$State$Loading;

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    move-object v5, v3

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v5, v1

    .line 56
    :goto_1
    invoke-virtual {p2}, Lcoil/compose/AsyncImagePainter$State;->a()Lw0/b;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget-object v7, p0, Lcoil/compose/AsyncImagePainter;->p:LI0/f;

    .line 61
    .line 62
    check-cast v2, LK4/a;

    .line 63
    .line 64
    invoke-virtual {v2}, LK4/a;->b()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    instance-of p1, v0, LG4/q;

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    check-cast v0, LG4/q;

    .line 73
    .line 74
    invoke-virtual {v0}, LG4/q;->d()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_2

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_2
    const/4 p1, 0x0

    .line 82
    :goto_2
    move v9, p1

    .line 83
    goto :goto_4

    .line 84
    :cond_3
    :goto_3
    const/4 p1, 0x1

    .line 85
    goto :goto_2

    .line 86
    :goto_4
    invoke-virtual {v2}, LK4/a;->c()Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    new-instance v4, Lcoil/compose/CrossfadePainter;

    .line 91
    .line 92
    invoke-direct/range {v4 .. v10}, Lcoil/compose/CrossfadePainter;-><init>(Lw0/b;Lw0/b;LI0/f;IZZ)V

    .line 93
    .line 94
    .line 95
    return-object v4

    .line 96
    :cond_4
    return-object v1
.end method


# virtual methods
.method public final C(LI0/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->p:LI0/f;

    .line 2
    .line 3
    return-void
.end method

.method public final D(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcoil/compose/AsyncImagePainter;->q:I

    .line 2
    .line 3
    return-void
.end method

.method public final E(Lv4/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->u:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final F(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->o:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final H(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcoil/compose/AsyncImagePainter;->r:Z

    .line 2
    .line 3
    return-void
.end method

.method public final I(LG4/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->t:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final K(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil/compose/AsyncImagePainter;->n:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method protected a(F)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcoil/compose/AsyncImagePainter;->A(F)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    return p1
.end method

.method protected b(Landroidx/compose/ui/graphics/d;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcoil/compose/AsyncImagePainter;->B(Landroidx/compose/ui/graphics/d;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    return p1
.end method

.method public c()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->g:LGf/O;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {v0, v1, v0}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, LGf/M0;->b2()LGf/M0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v2, v3}, LZd/i;->w(LZd/i;)LZd/i;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, LGf/P;->a(LZd/i;)LGf/O;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iput-object v3, p0, Lcoil/compose/AsyncImagePainter;->g:LGf/O;

    .line 29
    .line 30
    iget-object v2, p0, Lcoil/compose/AsyncImagePainter;->m:Lw0/b;

    .line 31
    .line 32
    instance-of v4, v2, LY/v1;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    check-cast v2, LY/v1;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v2, v0

    .line 40
    :goto_0
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-interface {v2}, LY/v1;->c()V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-boolean v2, p0, Lcoil/compose/AsyncImagePainter;->r:Z

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0}, Lcoil/compose/AsyncImagePainter;->y()LG4/h;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2, v0, v1, v0}, LG4/h;->R(LG4/h;Landroid/content/Context;ILjava/lang/Object;)LG4/h$a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p0}, Lcoil/compose/AsyncImagePainter;->w()Lv4/d;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {v2}, Lv4/d;->a()LG4/c;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, LG4/h$a;->d(LG4/c;)LG4/h$a;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, LG4/h$a;->a()LG4/h;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v2, Lcoil/compose/AsyncImagePainter$State$Loading;

    .line 74
    .line 75
    invoke-virtual {v1}, LG4/h;->F()Landroid/graphics/drawable/Drawable;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    invoke-direct {p0, v1}, Lcoil/compose/AsyncImagePainter;->N(Landroid/graphics/drawable/Drawable;)Lw0/b;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :cond_3
    invoke-direct {v2, v0}, Lcoil/compose/AsyncImagePainter$State$Loading;-><init>(Lw0/b;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, v2}, Lcoil/compose/AsyncImagePainter;->Q(Lcoil/compose/AsyncImagePainter$State;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    new-instance v6, Lcoil/compose/AsyncImagePainter$c;

    .line 93
    .line 94
    invoke-direct {v6, p0, v0}, Lcoil/compose/AsyncImagePainter$c;-><init>(Lcoil/compose/AsyncImagePainter;LZd/e;)V

    .line 95
    .line 96
    .line 97
    const/4 v7, 0x3

    .line 98
    const/4 v8, 0x0

    .line 99
    const/4 v4, 0x0

    .line 100
    const/4 v5, 0x0

    .line 101
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcoil/compose/AsyncImagePainter;->t()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->m:Lw0/b;

    .line 5
    .line 6
    instance-of v1, v0, LY/v1;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, LY/v1;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, LY/v1;->d()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcoil/compose/AsyncImagePainter;->t()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->m:Lw0/b;

    .line 5
    .line 6
    instance-of v1, v0, LY/v1;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, LY/v1;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, LY/v1;->e()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public k()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcoil/compose/AsyncImagePainter;->x()Lw0/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lw0/b;->k()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    sget-object v0, Lr0/l;->b:Lr0/l$a;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr0/l$a;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method protected m(Lu0/f;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->h:LJf/u;

    .line 2
    .line 3
    invoke-interface {p1}, Lu0/f;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {v1, v2}, Lr0/l;->c(J)Lr0/l;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcoil/compose/AsyncImagePainter;->x()Lw0/b;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Lu0/f;->f()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    invoke-direct {p0}, Lcoil/compose/AsyncImagePainter;->u()F

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-direct {p0}, Lcoil/compose/AsyncImagePainter;->v()Landroidx/compose/ui/graphics/d;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    move-object v3, p1

    .line 33
    invoke-virtual/range {v2 .. v7}, Lw0/b;->j(Lu0/f;JFLandroidx/compose/ui/graphics/d;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final w()Lv4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->u:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv4/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public final y()LG4/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil/compose/AsyncImagePainter;->t:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LG4/h;

    .line 8
    .line 9
    return-object v0
.end method
