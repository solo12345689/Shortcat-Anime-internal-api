.class final LU/j$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li0/E;


# direct methods
.method constructor <init>(Li0/E;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/j$a$a;->a:Li0/E;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LB/j;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    instance-of p2, p1, LB/g;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, LU/j$a$a;->a:Li0/E;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Li0/E;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    instance-of p2, p1, LB/h;

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, LU/j$a$a;->a:Li0/E;

    .line 16
    .line 17
    check-cast p1, LB/h;

    .line 18
    .line 19
    invoke-virtual {p1}, LB/h;->a()LB/g;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2, p1}, Li0/E;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    instance-of p2, p1, LB/d;

    .line 28
    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    iget-object p2, p0, LU/j$a$a;->a:Li0/E;

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Li0/E;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    instance-of p2, p1, LB/e;

    .line 38
    .line 39
    if-eqz p2, :cond_3

    .line 40
    .line 41
    iget-object p2, p0, LU/j$a$a;->a:Li0/E;

    .line 42
    .line 43
    check-cast p1, LB/e;

    .line 44
    .line 45
    invoke-virtual {p1}, LB/e;->a()LB/d;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p2, p1}, Li0/E;->remove(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    instance-of p2, p1, LB/o$b;

    .line 54
    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    iget-object p2, p0, LU/j$a$a;->a:Li0/E;

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Li0/E;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    instance-of p2, p1, LB/o$c;

    .line 64
    .line 65
    if-eqz p2, :cond_5

    .line 66
    .line 67
    iget-object p2, p0, LU/j$a$a;->a:Li0/E;

    .line 68
    .line 69
    check-cast p1, LB/o$c;

    .line 70
    .line 71
    invoke-virtual {p1}, LB/o$c;->a()LB/o$b;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p2, p1}, Li0/E;->remove(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    instance-of p2, p1, LB/o$a;

    .line 80
    .line 81
    if-eqz p2, :cond_6

    .line 82
    .line 83
    iget-object p2, p0, LU/j$a$a;->a:Li0/E;

    .line 84
    .line 85
    check-cast p1, LB/o$a;

    .line 86
    .line 87
    invoke-virtual {p1}, LB/o$a;->a()LB/o$b;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p2, p1}, Li0/E;->remove(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_6
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 95
    .line 96
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LB/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LU/j$a$a;->a(LB/j;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
