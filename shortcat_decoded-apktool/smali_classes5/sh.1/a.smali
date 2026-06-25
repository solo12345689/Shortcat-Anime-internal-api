.class public final Lsh/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private transient a:Lsh/k;

.field private final b:I

.field private final c:Ljava/util/List;

.field private d:I

.field private e:Lsh/u;

.field private f:Ljava/util/List;

.field private g:Ljava/util/Map;

.field private h:Ljava/util/Stack;

.field private i:Ljava/util/Map;

.field private j:I

.field private k:Z

.field private transient l:I


# direct methods
.method constructor <init>(Lsh/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsh/k;

    iget-object v1, p1, Lsh/a;->a:Lsh/k;

    invoke-virtual {v1}, Lsh/k;->d()Lsh/m;

    move-result-object v1

    invoke-direct {v0, v1}, Lsh/k;-><init>(Lsh/m;)V

    iput-object v0, p0, Lsh/a;->a:Lsh/k;

    iget v0, p1, Lsh/a;->b:I

    iput v0, p0, Lsh/a;->b:I

    iget v0, p1, Lsh/a;->d:I

    iput v0, p0, Lsh/a;->d:I

    iget-object v0, p1, Lsh/a;->e:Lsh/u;

    iput-object v0, p0, Lsh/a;->e:Lsh/u;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsh/a;->f:Ljava/util/List;

    iget-object v1, p1, Lsh/a;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lsh/a;->g:Ljava/util/Map;

    iget-object v0, p1, Lsh/a;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, p0, Lsh/a;->g:Ljava/util/Map;

    iget-object v3, p1, Lsh/a;->g:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedList;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lsh/a;->h:Ljava/util/Stack;

    iget-object v1, p1, Lsh/a;->h:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsh/a;->c:Ljava/util/List;

    iget-object v0, p1, Lsh/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lsh/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsh/c;

    invoke-virtual {v2}, Lsh/c;->a()Lsh/c;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/TreeMap;

    iget-object v1, p1, Lsh/a;->i:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lsh/a;->i:Ljava/util/Map;

    iget v0, p1, Lsh/a;->j:I

    iput v0, p0, Lsh/a;->j:I

    iget v0, p1, Lsh/a;->l:I

    iput v0, p0, Lsh/a;->l:I

    iget-boolean p1, p1, Lsh/a;->k:Z

    iput-boolean p1, p0, Lsh/a;->k:Z

    return-void
.end method

.method private constructor <init>(Lsh/a;Lzg/t;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsh/k;

    new-instance v1, Lsh/m;

    invoke-direct {v1, p2}, Lsh/m;-><init>(Lzg/t;)V

    invoke-direct {v0, v1}, Lsh/k;-><init>(Lsh/m;)V

    iput-object v0, p0, Lsh/a;->a:Lsh/k;

    iget p2, p1, Lsh/a;->b:I

    iput p2, p0, Lsh/a;->b:I

    iget p2, p1, Lsh/a;->d:I

    iput p2, p0, Lsh/a;->d:I

    iget-object p2, p1, Lsh/a;->e:Lsh/u;

    iput-object p2, p0, Lsh/a;->e:Lsh/u;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lsh/a;->f:Ljava/util/List;

    iget-object v0, p1, Lsh/a;->f:Ljava/util/List;

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance p2, Ljava/util/TreeMap;

    invoke-direct {p2}, Ljava/util/TreeMap;-><init>()V

    iput-object p2, p0, Lsh/a;->g:Ljava/util/Map;

    iget-object p2, p1, Lsh/a;->g:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p0, Lsh/a;->g:Ljava/util/Map;

    iget-object v2, p1, Lsh/a;->g:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/LinkedList;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/util/Stack;

    invoke-direct {p2}, Ljava/util/Stack;-><init>()V

    iput-object p2, p0, Lsh/a;->h:Ljava/util/Stack;

    iget-object v0, p1, Lsh/a;->h:Ljava/util/Stack;

    invoke-virtual {p2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lsh/a;->c:Ljava/util/List;

    iget-object p2, p1, Lsh/a;->c:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lsh/a;->c:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsh/c;

    invoke-virtual {v1}, Lsh/c;->a()Lsh/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance p2, Ljava/util/TreeMap;

    iget-object v0, p1, Lsh/a;->i:Ljava/util/Map;

    invoke-direct {p2, v0}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lsh/a;->i:Ljava/util/Map;

    iget p2, p1, Lsh/a;->j:I

    iput p2, p0, Lsh/a;->j:I

    iget p2, p1, Lsh/a;->l:I

    iput p2, p0, Lsh/a;->l:I

    iget-boolean p1, p1, Lsh/a;->k:Z

    iput-boolean p1, p0, Lsh/a;->k:Z

    invoke-direct {p0}, Lsh/a;->g()V

    return-void
.end method

.method private constructor <init>(Lsh/a;[B[BLsh/j;)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsh/k;

    iget-object v1, p1, Lsh/a;->a:Lsh/k;

    invoke-virtual {v1}, Lsh/k;->d()Lsh/m;

    move-result-object v1

    invoke-direct {v0, v1}, Lsh/k;-><init>(Lsh/m;)V

    iput-object v0, p0, Lsh/a;->a:Lsh/k;

    iget v0, p1, Lsh/a;->b:I

    iput v0, p0, Lsh/a;->b:I

    iget v0, p1, Lsh/a;->d:I

    iput v0, p0, Lsh/a;->d:I

    iget-object v0, p1, Lsh/a;->e:Lsh/u;

    iput-object v0, p0, Lsh/a;->e:Lsh/u;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsh/a;->f:Ljava/util/List;

    iget-object v1, p1, Lsh/a;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lsh/a;->g:Ljava/util/Map;

    iget-object v0, p1, Lsh/a;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, p0, Lsh/a;->g:Ljava/util/Map;

    iget-object v3, p1, Lsh/a;->g:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedList;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lsh/a;->h:Ljava/util/Stack;

    iget-object v1, p1, Lsh/a;->h:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsh/a;->c:Ljava/util/List;

    iget-object v0, p1, Lsh/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lsh/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsh/c;

    invoke-virtual {v2}, Lsh/c;->a()Lsh/c;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/TreeMap;

    iget-object v1, p1, Lsh/a;->i:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lsh/a;->i:Ljava/util/Map;

    iget v0, p1, Lsh/a;->j:I

    iput v0, p0, Lsh/a;->j:I

    iget p1, p1, Lsh/a;->l:I

    iput p1, p0, Lsh/a;->l:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lsh/a;->k:Z

    invoke-direct {p0, p2, p3, p4}, Lsh/a;->f([B[BLsh/j;)V

    return-void
.end method

.method private constructor <init>(Lsh/k;III)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/a;->a:Lsh/k;

    iput p2, p0, Lsh/a;->b:I

    iput p4, p0, Lsh/a;->l:I

    iput p3, p0, Lsh/a;->d:I

    if-gt p3, p2, :cond_1

    const/4 p1, 0x2

    if-lt p3, p1, :cond_1

    sub-int/2addr p2, p3

    rem-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lsh/a;->f:Ljava/util/List;

    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lsh/a;->g:Ljava/util/Map;

    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lsh/a;->h:Ljava/util/Stack;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lsh/a;->c:Ljava/util/List;

    const/4 p1, 0x0

    move p3, p1

    :goto_0
    if-ge p3, p2, :cond_0

    iget-object p4, p0, Lsh/a;->c:Ljava/util/List;

    new-instance v0, Lsh/c;

    invoke-direct {v0, p3}, Lsh/c;-><init>(I)V

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/util/TreeMap;

    invoke-direct {p2}, Ljava/util/TreeMap;-><init>()V

    iput-object p2, p0, Lsh/a;->i:Ljava/util/Map;

    iput p1, p0, Lsh/a;->j:I

    iput-boolean p1, p0, Lsh/a;->k:Z

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "illegal value for BDS parameter k"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method constructor <init>(Lsh/x;II)V
    .locals 2

    .line 5
    invoke-virtual {p1}, Lsh/x;->i()Lsh/k;

    move-result-object v0

    invoke-virtual {p1}, Lsh/x;->b()I

    move-result v1

    invoke-virtual {p1}, Lsh/x;->c()I

    move-result p1

    invoke-direct {p0, v0, v1, p1, p3}, Lsh/a;-><init>(Lsh/k;III)V

    iput p2, p0, Lsh/a;->l:I

    iput p3, p0, Lsh/a;->j:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lsh/a;->k:Z

    return-void
.end method

.method constructor <init>(Lsh/x;[B[BLsh/j;)V
    .locals 4

    .line 6
    invoke-virtual {p1}, Lsh/x;->i()Lsh/k;

    move-result-object v0

    invoke-virtual {p1}, Lsh/x;->b()I

    move-result v1

    invoke-virtual {p1}, Lsh/x;->c()I

    move-result v2

    invoke-virtual {p1}, Lsh/x;->b()I

    move-result p1

    const/4 v3, 0x1

    shl-int p1, v3, p1

    sub-int/2addr p1, v3

    invoke-direct {p0, v0, v1, v2, p1}, Lsh/a;-><init>(Lsh/k;III)V

    invoke-direct {p0, p2, p3, p4}, Lsh/a;->e([B[BLsh/j;)V

    return-void
.end method

.method constructor <init>(Lsh/x;[B[BLsh/j;I)V
    .locals 4

    .line 7
    invoke-virtual {p1}, Lsh/x;->i()Lsh/k;

    move-result-object v0

    invoke-virtual {p1}, Lsh/x;->b()I

    move-result v1

    invoke-virtual {p1}, Lsh/x;->c()I

    move-result v2

    invoke-virtual {p1}, Lsh/x;->b()I

    move-result p1

    const/4 v3, 0x1

    shl-int p1, v3, p1

    sub-int/2addr p1, v3

    invoke-direct {p0, v0, v1, v2, p1}, Lsh/a;-><init>(Lsh/k;III)V

    invoke-direct {p0, p2, p3, p4}, Lsh/a;->e([B[BLsh/j;)V

    :goto_0
    iget p1, p0, Lsh/a;->j:I

    if-ge p1, p5, :cond_0

    invoke-direct {p0, p2, p3, p4}, Lsh/a;->f([B[BLsh/j;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lsh/a;->k:Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a()Lsh/c;
    .locals 5

    .line 1
    iget-object v0, p0, Lsh/a;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_4

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lsh/c;

    .line 19
    .line 20
    invoke-virtual {v2}, Lsh/c;->g()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Lsh/c;->h()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-nez v1, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {v2}, Lsh/c;->c()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v1}, Lsh/c;->c()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-ge v3, v4, :cond_3

    .line 45
    .line 46
    :goto_1
    move-object v1, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-virtual {v2}, Lsh/c;->c()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v1}, Lsh/c;->c()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-ne v3, v4, :cond_0

    .line 57
    .line 58
    invoke-virtual {v2}, Lsh/c;->d()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {v1}, Lsh/c;->d()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-ge v3, v4, :cond_0

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    return-object v1
.end method

.method private e([B[BLsh/j;)V
    .locals 10

    .line 1
    if-eqz p3, :cond_6

    .line 2
    .line 3
    new-instance v0, Lsh/i$b;

    .line 4
    .line 5
    invoke-direct {v0}, Lsh/i$b;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Lsh/o;->b()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lsh/i$b;

    .line 17
    .line 18
    invoke-virtual {p3}, Lsh/o;->c()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-virtual {v0, v1, v2}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lsh/i$b;

    .line 27
    .line 28
    invoke-virtual {v0}, Lsh/i$b;->l()Lsh/o;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lsh/i;

    .line 33
    .line 34
    new-instance v1, Lsh/g$b;

    .line 35
    .line 36
    invoke-direct {v1}, Lsh/g$b;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Lsh/o;->b()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v2}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lsh/g$b;

    .line 48
    .line 49
    invoke-virtual {p3}, Lsh/o;->c()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    invoke-virtual {v1, v2, v3}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lsh/g$b;

    .line 58
    .line 59
    invoke-virtual {v1}, Lsh/g$b;->k()Lsh/o;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lsh/g;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    :goto_0
    iget v3, p0, Lsh/a;->b:I

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    shl-int v3, v4, v3

    .line 70
    .line 71
    if-ge v2, v3, :cond_5

    .line 72
    .line 73
    new-instance v3, Lsh/j$b;

    .line 74
    .line 75
    invoke-direct {v3}, Lsh/j$b;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Lsh/o;->b()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {v3, v5}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Lsh/j$b;

    .line 87
    .line 88
    invoke-virtual {p3}, Lsh/o;->c()J

    .line 89
    .line 90
    .line 91
    move-result-wide v5

    .line 92
    invoke-virtual {v3, v5, v6}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lsh/j$b;

    .line 97
    .line 98
    invoke-virtual {v3, v2}, Lsh/j$b;->p(I)Lsh/j$b;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {p3}, Lsh/j;->e()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-virtual {v3, v5}, Lsh/j$b;->n(I)Lsh/j$b;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {p3}, Lsh/j;->f()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-virtual {v3, v5}, Lsh/j$b;->o(I)Lsh/j$b;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {p3}, Lsh/o;->a()I

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    invoke-virtual {v3, p3}, Lsh/o$a;->f(I)Lsh/o$a;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    check-cast p3, Lsh/j$b;

    .line 127
    .line 128
    invoke-virtual {p3}, Lsh/j$b;->l()Lsh/o;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    check-cast p3, Lsh/j;

    .line 133
    .line 134
    iget-object v3, p0, Lsh/a;->a:Lsh/k;

    .line 135
    .line 136
    invoke-virtual {v3, p2, p3}, Lsh/k;->g([BLsh/j;)[B

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v3, v5, p1}, Lsh/k;->h([B[B)V

    .line 141
    .line 142
    .line 143
    iget-object v3, p0, Lsh/a;->a:Lsh/k;

    .line 144
    .line 145
    invoke-virtual {v3, p3}, Lsh/k;->e(Lsh/j;)Lsh/n;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    new-instance v5, Lsh/i$b;

    .line 150
    .line 151
    invoke-direct {v5}, Lsh/i$b;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Lsh/o;->b()I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    invoke-virtual {v5, v6}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    check-cast v5, Lsh/i$b;

    .line 163
    .line 164
    invoke-virtual {v0}, Lsh/o;->c()J

    .line 165
    .line 166
    .line 167
    move-result-wide v6

    .line 168
    invoke-virtual {v5, v6, v7}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Lsh/i$b;

    .line 173
    .line 174
    invoke-virtual {v5, v2}, Lsh/i$b;->n(I)Lsh/i$b;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-virtual {v0}, Lsh/i;->f()I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    invoke-virtual {v5, v6}, Lsh/i$b;->o(I)Lsh/i$b;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v0}, Lsh/i;->g()I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    invoke-virtual {v5, v6}, Lsh/i$b;->p(I)Lsh/i$b;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-virtual {v0}, Lsh/o;->a()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    invoke-virtual {v5, v0}, Lsh/o$a;->f(I)Lsh/o$a;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Lsh/i$b;

    .line 203
    .line 204
    invoke-virtual {v0}, Lsh/i$b;->l()Lsh/o;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Lsh/i;

    .line 209
    .line 210
    iget-object v5, p0, Lsh/a;->a:Lsh/k;

    .line 211
    .line 212
    invoke-static {v5, v3, v0}, Lsh/v;->a(Lsh/k;Lsh/n;Lsh/i;)Lsh/u;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    new-instance v5, Lsh/g$b;

    .line 217
    .line 218
    invoke-direct {v5}, Lsh/g$b;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Lsh/o;->b()I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    invoke-virtual {v5, v6}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    check-cast v5, Lsh/g$b;

    .line 230
    .line 231
    invoke-virtual {v1}, Lsh/o;->c()J

    .line 232
    .line 233
    .line 234
    move-result-wide v6

    .line 235
    invoke-virtual {v5, v6, v7}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    check-cast v5, Lsh/g$b;

    .line 240
    .line 241
    invoke-virtual {v5, v2}, Lsh/g$b;->n(I)Lsh/g$b;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-virtual {v1}, Lsh/o;->a()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    invoke-virtual {v5, v1}, Lsh/o$a;->f(I)Lsh/o$a;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    check-cast v1, Lsh/g$b;

    .line 254
    .line 255
    invoke-virtual {v1}, Lsh/g$b;->k()Lsh/o;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, Lsh/g;

    .line 260
    .line 261
    :goto_1
    iget-object v5, p0, Lsh/a;->h:Ljava/util/Stack;

    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    if-nez v5, :cond_4

    .line 268
    .line 269
    iget-object v5, p0, Lsh/a;->h:Ljava/util/Stack;

    .line 270
    .line 271
    invoke-virtual {v5}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    check-cast v5, Lsh/u;

    .line 276
    .line 277
    invoke-virtual {v5}, Lsh/u;->a()I

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    if-ne v5, v6, :cond_4

    .line 286
    .line 287
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    shl-int v5, v4, v5

    .line 292
    .line 293
    div-int v5, v2, v5

    .line 294
    .line 295
    if-ne v5, v4, :cond_0

    .line 296
    .line 297
    iget-object v6, p0, Lsh/a;->f:Ljava/util/List;

    .line 298
    .line 299
    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    :cond_0
    const/4 v6, 0x3

    .line 303
    if-ne v5, v6, :cond_1

    .line 304
    .line 305
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    iget v8, p0, Lsh/a;->b:I

    .line 310
    .line 311
    iget v9, p0, Lsh/a;->d:I

    .line 312
    .line 313
    sub-int/2addr v8, v9

    .line 314
    if-ge v7, v8, :cond_1

    .line 315
    .line 316
    iget-object v7, p0, Lsh/a;->c:Ljava/util/List;

    .line 317
    .line 318
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    check-cast v7, Lsh/c;

    .line 327
    .line 328
    invoke-virtual {v7, v3}, Lsh/c;->i(Lsh/u;)V

    .line 329
    .line 330
    .line 331
    :cond_1
    if-lt v5, v6, :cond_3

    .line 332
    .line 333
    and-int/lit8 v5, v5, 0x1

    .line 334
    .line 335
    if-ne v5, v4, :cond_3

    .line 336
    .line 337
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    iget v6, p0, Lsh/a;->b:I

    .line 342
    .line 343
    iget v7, p0, Lsh/a;->d:I

    .line 344
    .line 345
    sub-int/2addr v6, v7

    .line 346
    if-lt v5, v6, :cond_3

    .line 347
    .line 348
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 349
    .line 350
    .line 351
    move-result v5

    .line 352
    iget v6, p0, Lsh/a;->b:I

    .line 353
    .line 354
    add-int/lit8 v6, v6, -0x2

    .line 355
    .line 356
    if-gt v5, v6, :cond_3

    .line 357
    .line 358
    iget-object v5, p0, Lsh/a;->g:Ljava/util/Map;

    .line 359
    .line 360
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    if-nez v5, :cond_2

    .line 373
    .line 374
    new-instance v5, Ljava/util/LinkedList;

    .line 375
    .line 376
    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    iget-object v6, p0, Lsh/a;->g:Ljava/util/Map;

    .line 383
    .line 384
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 385
    .line 386
    .line 387
    move-result v7

    .line 388
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    goto :goto_2

    .line 396
    :cond_2
    iget-object v5, p0, Lsh/a;->g:Ljava/util/Map;

    .line 397
    .line 398
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    check-cast v5, Ljava/util/LinkedList;

    .line 411
    .line 412
    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    :cond_3
    :goto_2
    new-instance v5, Lsh/g$b;

    .line 416
    .line 417
    invoke-direct {v5}, Lsh/g$b;-><init>()V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v1}, Lsh/o;->b()I

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    invoke-virtual {v5, v6}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    check-cast v5, Lsh/g$b;

    .line 429
    .line 430
    invoke-virtual {v1}, Lsh/o;->c()J

    .line 431
    .line 432
    .line 433
    move-result-wide v6

    .line 434
    invoke-virtual {v5, v6, v7}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    check-cast v5, Lsh/g$b;

    .line 439
    .line 440
    invoke-virtual {v1}, Lsh/g;->e()I

    .line 441
    .line 442
    .line 443
    move-result v6

    .line 444
    invoke-virtual {v5, v6}, Lsh/g$b;->m(I)Lsh/g$b;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    invoke-virtual {v1}, Lsh/g;->f()I

    .line 449
    .line 450
    .line 451
    move-result v6

    .line 452
    sub-int/2addr v6, v4

    .line 453
    div-int/lit8 v6, v6, 0x2

    .line 454
    .line 455
    invoke-virtual {v5, v6}, Lsh/g$b;->n(I)Lsh/g$b;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    invoke-virtual {v1}, Lsh/o;->a()I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    invoke-virtual {v5, v1}, Lsh/o$a;->f(I)Lsh/o$a;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    check-cast v1, Lsh/g$b;

    .line 468
    .line 469
    invoke-virtual {v1}, Lsh/g$b;->k()Lsh/o;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    check-cast v1, Lsh/g;

    .line 474
    .line 475
    iget-object v5, p0, Lsh/a;->a:Lsh/k;

    .line 476
    .line 477
    iget-object v6, p0, Lsh/a;->h:Ljava/util/Stack;

    .line 478
    .line 479
    invoke-virtual {v6}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    check-cast v6, Lsh/u;

    .line 484
    .line 485
    invoke-static {v5, v6, v3, v1}, Lsh/v;->b(Lsh/k;Lsh/u;Lsh/u;Lsh/o;)Lsh/u;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    new-instance v5, Lsh/u;

    .line 490
    .line 491
    invoke-virtual {v3}, Lsh/u;->a()I

    .line 492
    .line 493
    .line 494
    move-result v6

    .line 495
    add-int/2addr v6, v4

    .line 496
    invoke-virtual {v3}, Lsh/u;->b()[B

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-direct {v5, v6, v3}, Lsh/u;-><init>(I[B)V

    .line 501
    .line 502
    .line 503
    new-instance v3, Lsh/g$b;

    .line 504
    .line 505
    invoke-direct {v3}, Lsh/g$b;-><init>()V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v1}, Lsh/o;->b()I

    .line 509
    .line 510
    .line 511
    move-result v6

    .line 512
    invoke-virtual {v3, v6}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    check-cast v3, Lsh/g$b;

    .line 517
    .line 518
    invoke-virtual {v1}, Lsh/o;->c()J

    .line 519
    .line 520
    .line 521
    move-result-wide v6

    .line 522
    invoke-virtual {v3, v6, v7}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    check-cast v3, Lsh/g$b;

    .line 527
    .line 528
    invoke-virtual {v1}, Lsh/g;->e()I

    .line 529
    .line 530
    .line 531
    move-result v6

    .line 532
    add-int/2addr v6, v4

    .line 533
    invoke-virtual {v3, v6}, Lsh/g$b;->m(I)Lsh/g$b;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    invoke-virtual {v1}, Lsh/g;->f()I

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    invoke-virtual {v3, v6}, Lsh/g$b;->n(I)Lsh/g$b;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    invoke-virtual {v1}, Lsh/o;->a()I

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    invoke-virtual {v3, v1}, Lsh/o$a;->f(I)Lsh/o$a;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    check-cast v1, Lsh/g$b;

    .line 554
    .line 555
    invoke-virtual {v1}, Lsh/g$b;->k()Lsh/o;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, Lsh/g;

    .line 560
    .line 561
    move-object v3, v5

    .line 562
    goto/16 :goto_1

    .line 563
    .line 564
    :cond_4
    iget-object v4, p0, Lsh/a;->h:Ljava/util/Stack;

    .line 565
    .line 566
    invoke-virtual {v4, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    add-int/lit8 v2, v2, 0x1

    .line 570
    .line 571
    goto/16 :goto_0

    .line 572
    .line 573
    :cond_5
    iget-object p1, p0, Lsh/a;->h:Ljava/util/Stack;

    .line 574
    .line 575
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object p1

    .line 579
    check-cast p1, Lsh/u;

    .line 580
    .line 581
    iput-object p1, p0, Lsh/a;->e:Lsh/u;

    .line 582
    .line 583
    return-void

    .line 584
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 585
    .line 586
    const-string p2, "otsHashAddress == null"

    .line 587
    .line 588
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    throw p1
.end method

.method private f([B[BLsh/j;)V
    .locals 11

    .line 1
    if-eqz p3, :cond_a

    .line 2
    .line 3
    iget-boolean v0, p0, Lsh/a;->k:Z

    .line 4
    .line 5
    if-nez v0, :cond_9

    .line 6
    .line 7
    iget v0, p0, Lsh/a;->j:I

    .line 8
    .line 9
    iget v1, p0, Lsh/a;->l:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    sub-int/2addr v1, v2

    .line 13
    if-gt v0, v1, :cond_8

    .line 14
    .line 15
    iget v1, p0, Lsh/a;->b:I

    .line 16
    .line 17
    invoke-static {v0, v1}, Lsh/A;->b(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v1, p0, Lsh/a;->j:I

    .line 22
    .line 23
    add-int/lit8 v3, v0, 0x1

    .line 24
    .line 25
    shr-int/2addr v1, v3

    .line 26
    and-int/2addr v1, v2

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    iget v1, p0, Lsh/a;->b:I

    .line 30
    .line 31
    sub-int/2addr v1, v2

    .line 32
    if-ge v0, v1, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, Lsh/a;->i:Ljava/util/Map;

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v4, p0, Lsh/a;->f:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_0
    new-instance v1, Lsh/i$b;

    .line 50
    .line 51
    invoke-direct {v1}, Lsh/i$b;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3}, Lsh/o;->b()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v1, v3}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lsh/i$b;

    .line 63
    .line 64
    invoke-virtual {p3}, Lsh/o;->c()J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    invoke-virtual {v1, v3, v4}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lsh/i$b;

    .line 73
    .line 74
    invoke-virtual {v1}, Lsh/i$b;->l()Lsh/o;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lsh/i;

    .line 79
    .line 80
    new-instance v3, Lsh/g$b;

    .line 81
    .line 82
    invoke-direct {v3}, Lsh/g$b;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Lsh/o;->b()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-virtual {v3, v4}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Lsh/g$b;

    .line 94
    .line 95
    invoke-virtual {p3}, Lsh/o;->c()J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    invoke-virtual {v3, v4, v5}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Lsh/g$b;

    .line 104
    .line 105
    invoke-virtual {v3}, Lsh/g$b;->k()Lsh/o;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lsh/g;

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    if-nez v0, :cond_2

    .line 113
    .line 114
    new-instance v0, Lsh/j$b;

    .line 115
    .line 116
    invoke-direct {v0}, Lsh/j$b;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3}, Lsh/o;->b()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-virtual {v0, v3}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Lsh/j$b;

    .line 128
    .line 129
    invoke-virtual {p3}, Lsh/o;->c()J

    .line 130
    .line 131
    .line 132
    move-result-wide v5

    .line 133
    invoke-virtual {v0, v5, v6}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lsh/j$b;

    .line 138
    .line 139
    iget v3, p0, Lsh/a;->j:I

    .line 140
    .line 141
    invoke-virtual {v0, v3}, Lsh/j$b;->p(I)Lsh/j$b;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {p3}, Lsh/j;->e()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-virtual {v0, v3}, Lsh/j$b;->n(I)Lsh/j$b;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {p3}, Lsh/j;->f()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-virtual {v0, v3}, Lsh/j$b;->o(I)Lsh/j$b;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p3}, Lsh/o;->a()I

    .line 162
    .line 163
    .line 164
    move-result p3

    .line 165
    invoke-virtual {v0, p3}, Lsh/o$a;->f(I)Lsh/o$a;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    check-cast p3, Lsh/j$b;

    .line 170
    .line 171
    invoke-virtual {p3}, Lsh/j$b;->l()Lsh/o;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    check-cast p3, Lsh/j;

    .line 176
    .line 177
    iget-object v0, p0, Lsh/a;->a:Lsh/k;

    .line 178
    .line 179
    invoke-virtual {v0, p2, p3}, Lsh/k;->g([BLsh/j;)[B

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v0, v3, p1}, Lsh/k;->h([B[B)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lsh/a;->a:Lsh/k;

    .line 187
    .line 188
    invoke-virtual {v0, p3}, Lsh/k;->e(Lsh/j;)Lsh/n;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    new-instance v3, Lsh/i$b;

    .line 193
    .line 194
    invoke-direct {v3}, Lsh/i$b;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Lsh/o;->b()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    invoke-virtual {v3, v5}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    check-cast v3, Lsh/i$b;

    .line 206
    .line 207
    invoke-virtual {v1}, Lsh/o;->c()J

    .line 208
    .line 209
    .line 210
    move-result-wide v5

    .line 211
    invoke-virtual {v3, v5, v6}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, Lsh/i$b;

    .line 216
    .line 217
    iget v5, p0, Lsh/a;->j:I

    .line 218
    .line 219
    invoke-virtual {v3, v5}, Lsh/i$b;->n(I)Lsh/i$b;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-virtual {v1}, Lsh/i;->f()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    invoke-virtual {v3, v5}, Lsh/i$b;->o(I)Lsh/i$b;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v1}, Lsh/i;->g()I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    invoke-virtual {v3, v5}, Lsh/i$b;->p(I)Lsh/i$b;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v1}, Lsh/o;->a()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-virtual {v3, v1}, Lsh/o$a;->f(I)Lsh/o$a;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    check-cast v1, Lsh/i$b;

    .line 248
    .line 249
    invoke-virtual {v1}, Lsh/i$b;->l()Lsh/o;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    check-cast v1, Lsh/i;

    .line 254
    .line 255
    iget-object v3, p0, Lsh/a;->a:Lsh/k;

    .line 256
    .line 257
    invoke-static {v3, v0, v1}, Lsh/v;->a(Lsh/k;Lsh/n;Lsh/i;)Lsh/u;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iget-object v1, p0, Lsh/a;->f:Ljava/util/List;

    .line 262
    .line 263
    invoke-interface {v1, v4, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    :cond_1
    move-object v10, p3

    .line 267
    goto/16 :goto_4

    .line 268
    .line 269
    :cond_2
    new-instance v1, Lsh/g$b;

    .line 270
    .line 271
    invoke-direct {v1}, Lsh/g$b;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Lsh/o;->b()I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    invoke-virtual {v1, v5}, Lsh/o$a;->g(I)Lsh/o$a;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    check-cast v1, Lsh/g$b;

    .line 283
    .line 284
    invoke-virtual {v3}, Lsh/o;->c()J

    .line 285
    .line 286
    .line 287
    move-result-wide v5

    .line 288
    invoke-virtual {v1, v5, v6}, Lsh/o$a;->h(J)Lsh/o$a;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Lsh/g$b;

    .line 293
    .line 294
    add-int/lit8 v5, v0, -0x1

    .line 295
    .line 296
    invoke-virtual {v1, v5}, Lsh/g$b;->m(I)Lsh/g$b;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    iget v6, p0, Lsh/a;->j:I

    .line 301
    .line 302
    shr-int/2addr v6, v0

    .line 303
    invoke-virtual {v1, v6}, Lsh/g$b;->n(I)Lsh/g$b;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v3}, Lsh/o;->a()I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    invoke-virtual {v1, v3}, Lsh/o$a;->f(I)Lsh/o$a;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    check-cast v1, Lsh/g$b;

    .line 316
    .line 317
    invoke-virtual {v1}, Lsh/g$b;->k()Lsh/o;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    check-cast v1, Lsh/g;

    .line 322
    .line 323
    iget-object v3, p0, Lsh/a;->a:Lsh/k;

    .line 324
    .line 325
    invoke-virtual {v3, p2, p3}, Lsh/k;->g([BLsh/j;)[B

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    invoke-virtual {v3, v6, p1}, Lsh/k;->h([B[B)V

    .line 330
    .line 331
    .line 332
    iget-object v3, p0, Lsh/a;->a:Lsh/k;

    .line 333
    .line 334
    iget-object v6, p0, Lsh/a;->f:Ljava/util/List;

    .line 335
    .line 336
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    check-cast v6, Lsh/u;

    .line 341
    .line 342
    iget-object v7, p0, Lsh/a;->i:Ljava/util/Map;

    .line 343
    .line 344
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    check-cast v7, Lsh/u;

    .line 353
    .line 354
    invoke-static {v3, v6, v7, v1}, Lsh/v;->b(Lsh/k;Lsh/u;Lsh/u;Lsh/o;)Lsh/u;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    new-instance v3, Lsh/u;

    .line 359
    .line 360
    invoke-virtual {v1}, Lsh/u;->a()I

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    add-int/2addr v6, v2

    .line 365
    invoke-virtual {v1}, Lsh/u;->b()[B

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-direct {v3, v6, v1}, Lsh/u;-><init>(I[B)V

    .line 370
    .line 371
    .line 372
    iget-object v1, p0, Lsh/a;->f:Ljava/util/List;

    .line 373
    .line 374
    invoke-interface {v1, v0, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    iget-object v1, p0, Lsh/a;->i:Ljava/util/Map;

    .line 378
    .line 379
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move v1, v4

    .line 387
    :goto_0
    if-ge v1, v0, :cond_4

    .line 388
    .line 389
    iget v3, p0, Lsh/a;->b:I

    .line 390
    .line 391
    iget v5, p0, Lsh/a;->d:I

    .line 392
    .line 393
    sub-int/2addr v3, v5

    .line 394
    if-ge v1, v3, :cond_3

    .line 395
    .line 396
    iget-object v3, p0, Lsh/a;->f:Ljava/util/List;

    .line 397
    .line 398
    iget-object v5, p0, Lsh/a;->c:Ljava/util/List;

    .line 399
    .line 400
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    check-cast v5, Lsh/c;

    .line 405
    .line 406
    invoke-virtual {v5}, Lsh/c;->e()Lsh/u;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    :goto_1
    invoke-interface {v3, v1, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    goto :goto_2

    .line 414
    :cond_3
    iget-object v3, p0, Lsh/a;->f:Ljava/util/List;

    .line 415
    .line 416
    iget-object v5, p0, Lsh/a;->g:Ljava/util/Map;

    .line 417
    .line 418
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    check-cast v5, Ljava/util/LinkedList;

    .line 427
    .line 428
    invoke-virtual {v5}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    goto :goto_1

    .line 433
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 434
    .line 435
    goto :goto_0

    .line 436
    :cond_4
    iget v1, p0, Lsh/a;->b:I

    .line 437
    .line 438
    iget v3, p0, Lsh/a;->d:I

    .line 439
    .line 440
    sub-int/2addr v1, v3

    .line 441
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    move v1, v4

    .line 446
    :goto_3
    if-ge v1, v0, :cond_1

    .line 447
    .line 448
    iget v3, p0, Lsh/a;->j:I

    .line 449
    .line 450
    add-int/2addr v3, v2

    .line 451
    shl-int v5, v2, v1

    .line 452
    .line 453
    mul-int/lit8 v5, v5, 0x3

    .line 454
    .line 455
    add-int/2addr v3, v5

    .line 456
    iget v5, p0, Lsh/a;->b:I

    .line 457
    .line 458
    shl-int v5, v2, v5

    .line 459
    .line 460
    if-ge v3, v5, :cond_5

    .line 461
    .line 462
    iget-object v5, p0, Lsh/a;->c:Ljava/util/List;

    .line 463
    .line 464
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v5

    .line 468
    check-cast v5, Lsh/c;

    .line 469
    .line 470
    invoke-virtual {v5, v3}, Lsh/c;->f(I)V

    .line 471
    .line 472
    .line 473
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 474
    .line 475
    goto :goto_3

    .line 476
    :goto_4
    iget p3, p0, Lsh/a;->b:I

    .line 477
    .line 478
    iget v0, p0, Lsh/a;->d:I

    .line 479
    .line 480
    sub-int/2addr p3, v0

    .line 481
    shr-int/2addr p3, v2

    .line 482
    if-ge v4, p3, :cond_7

    .line 483
    .line 484
    invoke-direct {p0}, Lsh/a;->a()Lsh/c;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    if-eqz v5, :cond_6

    .line 489
    .line 490
    iget-object v6, p0, Lsh/a;->h:Ljava/util/Stack;

    .line 491
    .line 492
    iget-object v7, p0, Lsh/a;->a:Lsh/k;

    .line 493
    .line 494
    move-object v8, p1

    .line 495
    move-object v9, p2

    .line 496
    invoke-virtual/range {v5 .. v10}, Lsh/c;->j(Ljava/util/Stack;Lsh/k;[B[BLsh/j;)V

    .line 497
    .line 498
    .line 499
    goto :goto_5

    .line 500
    :cond_6
    move-object v8, p1

    .line 501
    move-object v9, p2

    .line 502
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 503
    .line 504
    move-object p1, v8

    .line 505
    move-object p2, v9

    .line 506
    goto :goto_4

    .line 507
    :cond_7
    iget p1, p0, Lsh/a;->j:I

    .line 508
    .line 509
    add-int/2addr p1, v2

    .line 510
    iput p1, p0, Lsh/a;->j:I

    .line 511
    .line 512
    return-void

    .line 513
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 514
    .line 515
    const-string p2, "index out of bounds"

    .line 516
    .line 517
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    throw p1

    .line 521
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 522
    .line 523
    const-string p2, "index already used"

    .line 524
    .line 525
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    throw p1

    .line 529
    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    .line 530
    .line 531
    const-string p2, "otsHashAddress == null"

    .line 532
    .line 533
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    throw p1
.end method

.method private g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lsh/a;->f:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lsh/a;->g:Ljava/util/Map;

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Lsh/a;->h:Ljava/util/Stack;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lsh/a;->c:Ljava/util/List;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lsh/a;->i:Ljava/util/Map;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lsh/a;->b:I

    .line 22
    .line 23
    iget v1, p0, Lsh/a;->j:I

    .line 24
    .line 25
    int-to-long v1, v1

    .line 26
    invoke-static {v0, v1, v2}, Lsh/A;->l(IJ)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v1, "index in BDS state out of bounds"

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v1, "keep == null"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v1, "treeHashInstances == null"

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v1, "stack == null"

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "retain == null"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v1, "authenticationPath == null"

    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
.end method


# virtual methods
.method protected b()I
    .locals 1

    .line 1
    iget v0, p0, Lsh/a;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lsh/a;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public d([B[BLsh/j;)Lsh/a;
    .locals 1

    .line 1
    new-instance v0, Lsh/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lsh/a;-><init>(Lsh/a;[B[BLsh/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public h(Lzg/t;)Lsh/a;
    .locals 1

    .line 1
    new-instance v0, Lsh/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lsh/a;-><init>(Lsh/a;Lzg/t;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
