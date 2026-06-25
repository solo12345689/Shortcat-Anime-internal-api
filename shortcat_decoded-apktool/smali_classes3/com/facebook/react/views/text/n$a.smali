.class public final Lcom/facebook/react/views/text/n$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/n$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/text/Spanned;)V
    .locals 8

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-class v2, Landroid/text/style/ClickableSpan;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-interface {p1, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, [Landroid/text/style/ClickableSpan;

    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    array-length v2, v1

    .line 31
    const/4 v4, 0x1

    .line 32
    if-le v2, v4, :cond_0

    .line 33
    .line 34
    new-instance v2, Lcom/facebook/react/views/text/n$a$b;

    .line 35
    .line 36
    invoke-direct {v2, p1}, Lcom/facebook/react/views/text/n$a$b;-><init>(Landroid/text/Spanned;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, LUd/n;->I([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    array-length v2, v1

    .line 43
    :goto_0
    if-ge v3, v2, :cond_3

    .line 44
    .line 45
    aget-object v4, v1, v3

    .line 46
    .line 47
    invoke-interface {p1, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-interface {p1, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eq v5, v4, :cond_2

    .line 56
    .line 57
    if-ltz v5, :cond_2

    .line 58
    .line 59
    if-ltz v4, :cond_2

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-gt v5, v6, :cond_2

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-le v4, v6, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    new-instance v6, Lcom/facebook/react/views/text/n$a$a;

    .line 75
    .line 76
    invoke-direct {v6}, Lcom/facebook/react/views/text/n$a$a;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, v5, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-virtual {v6, v7}, Lcom/facebook/react/views/text/n$a$a;->e(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v5}, Lcom/facebook/react/views/text/n$a$a;->h(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v4}, Lcom/facebook/react/views/text/n$a$a;->f(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v3}, Lcom/facebook/react/views/text/n$a$a;->g(I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    iput-object v0, p0, Lcom/facebook/react/views/text/n$a;->a:Ljava/util/List;

    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public final a(I)Lcom/facebook/react/views/text/n$a$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/n$a;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/facebook/react/views/text/n$a$a;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/facebook/react/views/text/n$a$a;->c()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ne v2, p1, :cond_0

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return-object p1
.end method

.method public final b(II)Lcom/facebook/react/views/text/n$a$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/n$a;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/facebook/react/views/text/n$a$a;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/facebook/react/views/text/n$a$a;->d()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ne v2, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/facebook/react/views/text/n$a$a;->b()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-ne v2, p2, :cond_0

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/n$a;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
