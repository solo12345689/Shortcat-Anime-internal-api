.class final LNb/a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNb/a;->a(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Ll5/d;LS4/a;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lexpo/modules/image/ExpoImageViewWrapper;

.field final synthetic c:LS4/a;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:Landroid/graphics/drawable/Drawable;


# direct methods
.method constructor <init>(Lexpo/modules/image/ExpoImageViewWrapper;LS4/a;Ljava/lang/Object;IILandroid/graphics/drawable/Drawable;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LNb/a$a;->b:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 2
    .line 3
    iput-object p2, p0, LNb/a$a;->c:LS4/a;

    .line 4
    .line 5
    iput-object p3, p0, LNb/a$a;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iput p4, p0, LNb/a$a;->e:I

    .line 8
    .line 9
    iput p5, p0, LNb/a$a;->f:I

    .line 10
    .line 11
    iput-object p6, p0, LNb/a$a;->g:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 8

    .line 1
    new-instance v0, LNb/a$a;

    .line 2
    .line 3
    iget-object v1, p0, LNb/a$a;->b:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 4
    .line 5
    iget-object v2, p0, LNb/a$a;->c:LS4/a;

    .line 6
    .line 7
    iget-object v3, p0, LNb/a$a;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget v4, p0, LNb/a$a;->e:I

    .line 10
    .line 11
    iget v5, p0, LNb/a$a;->f:I

    .line 12
    .line 13
    iget-object v6, p0, LNb/a$a;->g:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, LNb/a$a;-><init>(Lexpo/modules/image/ExpoImageViewWrapper;LS4/a;Ljava/lang/Object;IILandroid/graphics/drawable/Drawable;LZd/e;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LNb/a$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LNb/a$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LNb/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LNb/a$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LNb/a$a;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LNb/a$a;->b:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 12
    .line 13
    invoke-virtual {p1}, Lexpo/modules/image/ExpoImageViewWrapper;->getOnLoad$expo_image_release()Lvc/b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lexpo/modules/image/records/ImageLoadEvent;

    .line 18
    .line 19
    sget-object v1, LMb/a;->b:LMb/a$a;

    .line 20
    .line 21
    iget-object v2, p0, LNb/a$a;->c:LS4/a;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, LMb/a$a;->a(LS4/a;)LMb/a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "getDefault(...)"

    .line 36
    .line 37
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "toLowerCase(...)"

    .line 45
    .line 46
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lexpo/modules/image/records/ImageSource;

    .line 50
    .line 51
    iget-object v2, p0, LNb/a$a;->d:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget v5, p0, LNb/a$a;->e:I

    .line 58
    .line 59
    iget v6, p0, LNb/a$a;->f:I

    .line 60
    .line 61
    iget-object v2, p0, LNb/a$a;->g:Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    instance-of v8, v2, Landroid/graphics/drawable/Animatable;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    invoke-direct/range {v3 .. v8}, Lexpo/modules/image/records/ImageSource;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1, v3}, Lexpo/modules/image/records/ImageLoadEvent;-><init>(Ljava/lang/String;Lexpo/modules/image/records/ImageSource;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v0}, Lvc/b;->invoke(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p1, LTd/L;->a:LTd/L;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1
.end method
